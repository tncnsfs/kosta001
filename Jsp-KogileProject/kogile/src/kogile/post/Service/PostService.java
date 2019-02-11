package kogile.post.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kogile.post.DAO.PostDao;
import kogile.post.DTO.DescriptionDTO;
import kogile.post.DTO.ReplyDTO;
import kogile.post.DTO.ReplyMemberDTO;
import kogile.post.DTO.ReplyUpdateSearchDTO;
import kogile.post.DTO.TagDTO;
import kogile.post.Model.CardDTO;
import kogile.post.Model.ChargeDTO;
import kogile.post.Model.DdateDTO;
import kogile.post.Model.LabelDTO;
import kogile.post.Model.LabelInfoDTO;
import kogile.post.Model.MemberDTO;
import kogile.post.Model.PostDTO;
import kogile.post.Model.PostMemberDTO;
import net.sf.json.JSONArray;

public class PostService {
	private static PostService service = new PostService();
	private static PostDao dao;
	
	public static PostService getInstance() {
		dao = PostDao.getInstance();
		
		return service;
	}
	
	public void listlabel(HttpServletRequest request, HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();
//		int pjt_no = (Integer)session.getAttribute("pjt_no");
		int pjt_no = (Integer)session.getAttribute("pjt_no");		
		List<LabelDTO> list = dao.listlabel(pjt_no);
		
		JSONArray jsonarr = new JSONArray();
		jsonarr = JSONArray.fromObject(list);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(jsonarr.toString());
		
//		return list;
	}
	
	public void insertLabelService(HttpServletRequest request, HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();
		
		LabelDTO label = new LabelDTO();
		
		int p_no = (Integer)session.getAttribute("p_no");
		
		label.setColor_no(Integer.parseInt(request.getParameter("label_color")));
		label.setLabel_text(request.getParameter("label_text"));
		label.setPjt_no(dao.searchpjt(p_no));	
		dao.insertlabel(label);
	}
	
	public void deleteLabelService(HttpServletRequest request, HttpServletResponse response)throws Exception {
		LabelDTO label = new LabelDTO();
//		String text = request.getParameter("label_text");
//		int color_no = Integer.parseInt(request.getParameter("color_no"));
		
		int label_no = Integer.parseInt(request.getParameter("label_no"));
		label.setLabel_no(label_no);
		
		dao.deletelabel(label);
	}
	
	
	public void updateLabelService(HttpServletRequest request, HttpServletResponse response)throws Exception{
		LabelDTO label = new LabelDTO();
		int label_no = Integer.parseInt(request.getParameter("label_no"));
		String label_text = request.getParameter("label_text");
		int color_no = Integer.parseInt(request.getParameter("color_no"));
		
		label.setLabel_no(label_no);
		label.setLabel_text(label_text);
		label.setColor_no(color_no);
		
		dao.updateLabel(label);
	}
	
	public LabelDTO updateLabelFormService(HttpServletRequest request, HttpServletResponse response)throws Exception {
		int label_no = Integer.parseInt(request.getParameter("label_no"));
		LabelDTO label = dao.searchLabel(label_no);
		
		return label;
	}
	
	public List<LabelDTO> postDetailViewService(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		HttpSession session = request.getSession();
		
		int p_no = (Integer)session.getAttribute("p_no");
		
		if(request.getParameter("label_no") != null) {
			int label_no = Integer.parseInt(request.getParameter("label_no"));
			LabelInfoDTO label_info = new LabelInfoDTO();
			label_info.setLabel_no(label_no);
			label_info.setP_no(p_no);
			
			dao.insertLabelInfo(label_info);
		}
		
		List<LabelDTO> list = dao.detialviewlabel(p_no);
		
		
		return list;
	}
	
	public void deleteLabelInfoService(HttpServletRequest request, HttpServletResponse response)throws Exception{
		HttpSession session = request.getSession();
		
		LabelInfoDTO label_info = new LabelInfoDTO();
		int label_no = Integer.parseInt(request.getParameter("label_no"));
		int p_no = (Integer)session.getAttribute("p_no");
		
		
		label_info.setLabel_no(label_no);
		label_info.setP_no(p_no);
		dao.deleteLabelInfo(label_info);
	}
	
	public void insertPostActionService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PostDTO postDTO = new PostDTO();

		// insertForm�뿉�꽌 �엯�젰�븳 媛믪쓣 PostDTO�뿉 �떞�뒗�떎.
		postDTO.setP_title(request.getParameter("p_title"));
		postDTO.setC_no(Integer.parseInt(request.getParameter("pjt_card")));
		dao.insertPost(postDTO);

		// 理쒓렐�뿉 �깮�꽦�맂 Post�쓽 p_no瑜� 媛��졇�삤�뒗 �옉�뾽
		int p_no = dao.selectPost();
		
		//�깮�꽦�븳 post �젙蹂대�� json 媛앹껜濡� 泥섎━
		JSONArray jsonarr = new JSONArray();
		jsonarr.add(dao.detailPost(p_no));

		// insertForm�뿉�꽌 泥댄겕�븳 �떞�떦�옄�뱾�쓣 chargeDTO瑜� �넻�빐 �떞�뒗 怨쇱젙
		ChargeDTO chargeDTO = new ChargeDTO();

		// checkbox�뿉�꽌 �꽑�깮�맂 �떞�떦�옄�뱾�쓣 �떞�뒗�떎.
		// String 諛곗뿴�뿉 �꽑�깮�븳 member瑜� �떞�뒗�떎.
		String[] supervisorStr = request.getParameterValues("pjt_member");

		// int 諛곗뿴�뿉 member�뱾�쓣 �꽑�뼵�븳�떎.
		int[] supervisors = new int[supervisorStr.length];

		// 諛쏆� �떞�떦�옄�뱾�쓣 int濡� �삎蹂��솚 �떆�궓�떎.
		for (int i = 0; i < supervisorStr.length; i++) {
			System.out.println(supervisorStr[i]);
			supervisors[i] = Integer.parseInt(supervisorStr[i]);
		}

		// �삎蹂��솚 �떆�궓 pjt_member瑜� for臾몄쑝濡� �쟾遺� 異쒕젰�븳�떎.
		for (int i = 0; i < supervisors.length; i++) {

			// �삎蹂��솚 �떆�궓 �떞�떦�옄�뱾�쓣 DTO 媛앹껜�뿉 set�븳�떎.
			chargeDTO.setP_no(p_no);
			chargeDTO.setInfo_no(supervisors[i]);

			// �떞湲� DTO瑜� Mapping�븳�떎.
			dao.chargeInfo(chargeDTO);
		}

		// 留덇컧�씪 援ы븯�뒗 媛앹껜
		DdateDTO ddateDTO = new DdateDTO();

		ddateDTO.setP_no(p_no);

		// �엯�젰�븳 Form name�쓣 �엯�젰�븳�떎.
		ddateDTO.setD_date(request.getParameter("DateInfo"));

		// �빐�떦 Post�뿉 Mapping�븳�떎.
		dao.DdateInsertPost(ddateDTO);
	}

	// listPostAction (Post 由ъ뒪�듃 蹂닿린)(card_no濡쒕텋�윭�삤湲�)
	public void listPostActionService(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();
		int pjt_no = (Integer)session.getAttribute("pjt_no");
		// list�뿉 Mapping�븷 硫붿냼�뱶瑜� �떞�뒗�떎.
		List<CardDTO> cards = dao.card_info(pjt_no);
		request.setAttribute("card", cards);
		System.out.println(cards.toString());
		
		List<PostDTO> post = dao.listPost(pjt_no);
		request.setAttribute("post", post);
		System.out.println(post.toString());
		
		
//		List<PostDTO> todo = dao.listPost(cards.get(0).getC_no());
//		request.setAttribute("todo", todo);
//		
//		List<PostDTO> doing = dao.listPost(cards.get(1).getC_no());
//		request.setAttribute("doing", doing);
//		
//		List<PostDTO> done = dao.listPost(cards.get(2).getC_no());
//		request.setAttribute("done", done);
//		
//		List<PostDTO> close = dao.listPost(cards.get(3).getC_no());
//		request.setAttribute("close", close);
		

		// list瑜� return�븯�뿬 Action�뿉�꽌 Forward�븳�떎.
//		return list;
	}

	// detailPostAction (Post �궡�슜 蹂닿린)
	public void detailPostActionService(HttpServletRequest request, HttpServletResponse response)throws IOException {
		HttpSession session = request.getSession();

		// PostDTO�뿉 �엳�뒗 p_no瑜� 媛�吏�怨� �삩�떎.
		int p_no = (Integer)session.getAttribute("p_no");

		// postDTO�뿉 mapping�븷 硫붿냼�뱶瑜� �꽔�뒗�떎.
		PostDTO postDTO = dao.detailPost(p_no);

		// DdateDTO�뿉 Mapping�븷 硫붿냼�뱶瑜� �꽔�뒗�떎.
		DdateDTO ddateDTO = dao.DdateInfo(p_no);

		// d_day�뿉 set�븳�떎.
//		request.setAttribute("DdateDTO", ddateDTO);

		// postDTO瑜� return�븯�뿬 Action�뿉�꽌 Forward�븳�떎.
//		return postDTO;
		
		JSONArray jsonarr = new JSONArray();
		jsonarr.add(postDTO);
//		jsonarr.add(JSONArray.fromObject(postDTO));
//		jsonarr.add(JSONArray.fromObject(ddateDTO)); 
		jsonarr.add(ddateDTO);
		
		response.setCharacterEncoding("utf-8");
//		System.out.println(jsonarr.toString());
		response.getWriter().print(jsonarr.toString());
		
	}

	// updatePostFormAction (Post �궡�슜 �닔�젙 Form �씠�룞)
	public PostDTO updatePostFormActionService(HttpServletRequest request) {
		HttpSession session = request.getSession();
		// p_no瑜� 媛��졇�삩�떎.
		int p_no = (Integer)session.getAttribute("p_no");

		// postDTO�뿉 �떞�뒗�떎.
		PostDTO postDTO = dao.detailPost(p_no);

		// postDTO瑜� return�븯�뿬 Action�뿉�꽌 Form�쑝濡� Forward�븳�떎.
		return postDTO;
	}

	// updatePostAction (Post �궡�슜 �닔�젙)
	public void updatePostActionService(HttpServletRequest request) {

		PostDTO postDTO = new PostDTO();
		HttpSession session = request.getSession();
		// �닔�젙�맂 �궡�슜�쓽 踰덊샇瑜� set�븳�떎.
		postDTO.setP_no((Integer)session.getAttribute("p_no"));

		// �닔�젙�맂 �궡�슜�쓽 �젣紐⑹쓣 set�븳�떎.
		postDTO.setP_title(request.getParameter("update_title"));

		// Mapping�븳�떎.
		dao.updatePost(postDTO);

	}

	// updateDdateAction (留덇컧�씪 �궡�슜 �닔�젙)
	public void updateDdateActionService(HttpServletRequest request, HttpServletResponse response) {

		DdateDTO ddateDTO = new DdateDTO();

		HttpSession session = request.getSession();
		
		int p_no = (Integer)session.getAttribute("p_no");
		
		ddateDTO.setP_no(p_no);
		
		ddateDTO.setD_date(request.getParameter("update_Ddate"));
		
		
		if (dao.detailDdate(p_no) != null) {
			
			ddateDTO.setD_date(request.getParameter("update_Ddate"));

			dao.updateDdate(ddateDTO);
			
		} else {

			// �빐�떦 Post�뿉 Mapping�븳�떎.
			dao.DdateInsertPost(ddateDTO);
		}
		
	}

	// updateDdateFormAction (Ddate �닔�젙 Form �씠�룞)
	public DdateDTO updateDdateFormActionService(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		// p_no瑜� 媛��졇�삩�떎.
		int p_no = (Integer)session.getAttribute("p_no"); 
		// DdateDTO�뿉 �떞�뒗�떎.
		DdateDTO ddateDto = dao.detailDdate(p_no);

		// DdateDTO瑜� return�븯�뿬 Action�뿉�꽌 Form�쑝濡� Forward�븳�떎.
		return ddateDto;
	}

	// deletePostAction (Post �궡�슜 �궘�젣)
	public void deletePostActionService(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		// �궘�젣�븷 postDTO�쓽 p_no瑜� 媛��졇�삩�떎.
		int p_no = (Integer)session.getAttribute("p_no");

		// Mapping�븳�떎.
		dao.deletePost(p_no);
	}
	
	// deleteDdateAction (留덇컧�씪 �궘�젣)
	public void deleteDdateActionService(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		// �궘�젣�븷 p_no 媛��졇�삩�떎.
		int p_no = (Integer)session.getAttribute("p_no");
		
		// �궘�젣�븷 硫붿냼�뱶 Mapping
		dao.deleteDdate(p_no);
	}
	

	// list�뿉 �쉶�썝 �씠由�, �씠硫붿씪 �떞湲� //card �젙蹂� 異붽� json泥�
	public void listMemberService(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();

		// Project�뿉 �룷�븿�맆 �씤�썝�쓣 �떞�븘�빞 �븯湲� �븣臾몄뿉 �봽濡쒖젥�듃 踰덊샇瑜� 媛��졇�삩�떎.
		int pjt_no = (Integer)session.getAttribute("pjt_no"); 
		System.out.println(pjt_no);

		// list�뿉 Mapping�븷 硫붿냼�뱶瑜� �떞�뒗�떎.
		List<MemberDTO> list = dao.listMember(pjt_no);
		
		JSONArray jsonarr = new JSONArray();
		jsonarr.add(JSONArray.fromObject(list));
//		response.getWriter().print(jsonarr.toString());
		
		List<CardDTO> list2 = dao.card_info(pjt_no);
//
		jsonarr.add(JSONArray.fromObject(list2));
//		System.out.println(jsonarr.toString());
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(jsonarr.toString());
		// list瑜� return�븯�뿬 Action�뿉�꽌 Set �썑 Forward �븳�떎.
//		return list;
	}

//	// list�뿉 card �씠由�, �쐞移� �떞湲� 
//	public void cardInfoService(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		HttpSession session = request.getSession();
//		int pjt_no = (Integer)session.getAttribute("pjt_no");
//		// �봽濡쒖젥�듃�뿉 �룷�븿�맂 card 紐⑸줉�쓣 媛��졇�삤湲� �쐞�빐 list�뿉 �떞�뒗�떎.
//		List<CardDTO> list = dao.card_info(pjt_no);
//		
//		JSONArray jsonarr = new JSONArray();
//		jsonarr.add(JSONArray.fromObject(list));
//		System.out.println(jsonarr.toString());
//		response.getWriter().print(jsonarr.toString());
//		// list瑜� return�븯�뿬 Action�뿉�꽌 set �썑 Forward �븳�떎.
////		return list;
//
//	}

	// Post �궡遺��뿉 �떞�떦�옄瑜� 異쒕젰�븯湲�
	public List<PostMemberDTO> PostMemberListService(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession session = request.getSession();
		// p_no�뿉 �룷�븿�맂 �떞�떦�옄瑜� 媛��졇���빞 �븳�떎.
		int p_no = (Integer)session.getAttribute("p_no");

		// 媛��졇�삩 p_no瑜� mapping�븯�뿬 list�뿉 �떞�뒗�떎.
		List<PostMemberDTO> list = dao.PostMemberlist(p_no);

		// list瑜� return�븯�뿬 Action�뿉�꽌 set �썑 Forward �븳�떎.
		return list;
	}

	// �쁽�옱�궇吏쒕�� insertForm�뿉 媛��졇媛�湲�
	public DdateDTO DateInfoService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		int p_no = (Integer)session.getAttribute("p_no");

		DdateDTO ddateDTO = dao.DdateInfo(p_no);

		return ddateDTO;
	}
	//�꽕紐� �옉�꽦
	public int insertDescriptionService(HttpServletRequest request)throws Exception {
		DescriptionDTO description = new DescriptionDTO();
		//�꽕紐낅궡�슜 諛쏆븘�� �뀑�똿
		description.setD_contents(request.getParameter("d_contents"));
		//�썤�궇 �닔�젙�븘�슂 >> �룷�뒪�듃 �꽆踰� 諛쏆븘�� �뀑�똿
		description.setP_no(1);
		return dao.insertDescription(description);
	}
	//�룷�뒪�듃 �궡遺��럹�씠吏� 蹂댁씠湲�
	public void descriptionDetailService(HttpServletRequest request, HttpServletResponse response)throws Exception{
		//session �뿉�꽌pno �젙蹂� 諛쏆븘�꽌 �꽕紐� 異쒕젰
		HttpSession session = request.getSession();
		int p_no = 1;
		
		if(session.getAttribute("p_no") == null){
			p_no=(Integer)session.getAttribute("p_no");
		}
		DescriptionDTO detail = dao.descriptionDetail(p_no);
//		request.setAttribute("p_no", p_no);
//		request.setAttribute("detail", detail);
		
		JSONArray jsonarr = new JSONArray();
		jsonarr.add(detail);
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(jsonarr.toString());
		
//		return detail;
	}
	//�꽕紐� �궘�젣
	public int deleteDescription(HttpServletRequest request)throws Exception {
		DescriptionDTO description = new DescriptionDTO();
		//�빐�떦�븯�뒗 �룷�뒪�듃 �꽆踰� 諛쏆븘�� �뀑�똿
		int seq = Integer.parseInt(request.getParameter("p_no"));
		description.setP_no(seq);
		return dao.deleteDescription(description);	
	}
	//�꽕紐� �닔�젙
	public int updateDescription(HttpServletRequest request)throws Exception{
		DescriptionDTO description = new DescriptionDTO();
		//�빐�떦�븯�뒗 �룷�뒪�듃 �꽆踰� 諛쏆븘�� �뀑�똿
		int seq = Integer.parseInt(request.getParameter("p_no"));
		description.setP_no(seq);
		//�꽕紐낅궡�슜 諛쏆븘�� �뀑�똿
		description.setD_contents(request.getParameter("d_contents"));
		return dao.updateDescription(description);
	}
	//�뙎湲� �옉�꽦
	public int insertReplyService(HttpServletRequest request)throws Exception {
		ReplyDTO reply = new ReplyDTO();
		//�뙎湲��궡�슜諛쏆븘�� �뀑�똿
		reply.setR_contents(request.getParameter("r_contents"));
		//�썤�궇 �닔�젙�븘�슂 >>�룷�뒪�듃�꽆踰� �뀑�똿 , �궗�슜�옄 �뀑�똿
		reply.setP_no(1);
		reply.setInfo_no(1);
		return dao.insertReply(reply);
	}
	//�뙎湲� 由ъ뒪�듃 蹂댁씠湲�
	public List<ReplyDTO> replyListService(HttpServletRequest request)throws Exception{
		//�썤�궇 �닔�젙�븘�슂 >> �룷�뒪�듃 �꽆踰� �뀑�똿
		int p_no =1;
		//�빐�떦�븯�뒗 �룷�뒪�듃 �꽆踰꾩쓽 �뙎湲��뱾 由ъ뒪�듃濡� �뀑�똿
		List<ReplyDTO> list = dao.replyList(p_no);
		request.setAttribute("list", list);
		
		return dao.replyList(p_no);
	}
	//�뙎湲� �옉�꽦�옄
	public List<ReplyMemberDTO> replyMemberListService(HttpServletRequest request)throws Exception{
		//�썤�궇 �닔�젙�븘�슂 >> �룷�뒪�듃 �꽆踰� �뀑�똿
		int p_no =1;
		//�뙎湲� �옉�꽦�옄 �뀑�똿
		List<ReplyMemberDTO> list = dao.replyMemberList(p_no);
		request.setAttribute("memberList", list);
		
		return list;
	}
	//�뙎湲� �궘�젣
	public int deleteReplyService(HttpServletRequest request)throws Exception {
		ReplyDTO reply = new ReplyDTO();
		//�뙎湲� 踰덊샇 諛쏆븘�삤湲�
		int seq = Integer.parseInt(request.getParameter("r_no"));
		//�뙎湲� �옉�꽦�옄 �꽆踰� 諛쏆븘�삤湲�
		int seq2 = Integer.parseInt(request.getParameter("info_no"));
		//�뙎湲� 踰덊샇 �뀑�똿�븯湲�
		reply.setR_no(seq);
		//�뙎湲� �옉�꽦�옄 �꽆踰� �뀑�똿�븯湲�
		reply.setInfo_no(seq2);
		return dao.deleteReply(reply);
	}
	//�뙎湲� �닔�젙 �뤌蹂댁씠湲�
	public void replyUpdateFormService(HttpServletRequest request)throws Exception {
		//�뙎湲� 踰덊샇 媛��졇�삤湲�
		int seq = Integer.parseInt(request.getParameter("r_no"));
		//�뙎湲� �옉�꽦�옄 �꽆踰� 媛��졇�삤湲�
		int seq2 = Integer.parseInt(request.getParameter("info_no"));
		//硫붿꽌�뱶�뿉 �뙆�씪誘명꽣濡� �꽆寃⑥쨪 由ы뵆
		ReplyUpdateSearchDTO search = new ReplyUpdateSearchDTO();
		//�뙎湲� 踰덊샇 �뀑�똿�븯湲�
		search.setSearch_r_no(seq);
		//�뙎湲� �옉�꽦�옄 �꽆踰� �뀑�똿�븯湲�
		search.setSearch_info_no(seq2);
		//荑쇰━ �떎�뻾�썑諛쏆븘�삱 由ы뵆
		ReplyDTO reply = dao.replyUpdateSearch(search);

		request.setAttribute("replyOrgin", reply);
	}
	//�뙎湲� �닔�젙
	public int updateReplyService(HttpServletRequest request)throws Exception {
		ReplyDTO reply = new ReplyDTO();
		//�뙎湲� 踰덊샇 媛��졇�삤湲�
		int seq = Integer.parseInt(request.getParameter("r_no"));
		//�옉�꽦�옄 �꽆踰� 媛��졇�삤湲�
		int seq2 = Integer.parseInt(request.getParameter("info_no"));
		//�뙎湲� �궡�슜 �뀑�똿
		reply.setR_contents(request.getParameter("r_contents"));
		//�뙎湲� 踰덊샇 �뀑�똿
		reply.setR_no(seq);
		//�옉�꽦�옄 �꽆踰� �뀑�똿
		reply.setInfo_no(seq2);
		return dao.updateReply(reply);
	}
	//�깭洹명븯湲�
	public int insertTagService(HttpServletRequest request)throws Exception {
		TagDTO tag = new TagDTO();
		//�뙎湲��꽆踰� 媛��졇�삤湲�
		int replyNum = dao.replyNum();
		//�뙎湲��꽆踰� �뀑�똿�븯湲�
		tag.setR_no(replyNum);
		//�옉�꽦�옄 踰덊샇 媛��졇�삤湲�
		String test = request.getParameter("t.info_no");
		//�옉�꽦�옄 踰덊샇媛� ex)�쉶�썝1.1 濡� �릺�뼱�엳�쓬 洹몃옒�꽌 �씪�떒 .�쓣 李얜뒗�떎
		int start = test.indexOf('.');
		//.遺��꽣 �걹源뚯� 吏ㅻ씪�궦�떎
		String test1 = test.substring(start + 1, test.length());
		// 留뚯빟 吏ㅻ씪�궦寃� �븘臾닿쾬�룄 �뾾�떎硫� 濡ㅻ갚�븳�떎
		if(test1 =="") {
			return -1;
		}else {
		// 臾댁뒯 媛믪씠 �뱾�뼱媛� �엳�떎硫� �옉�꽦�옄踰덊샇瑜� �뀑�똿�븳�떎
			tag.setInfo_no(Integer.parseInt(test1));
			return dao.insertTag(tag);
		}
	}
	//�깭洹몃��긽 �꽕�젙
	public List<TagDTO> tagMemberListService(HttpServletRequest request)throws Exception{
		//�닔�젙�븘�슂 >> �룷�뒪�듃 �꽆踰� �뀑�똿�븳�떎
		int pjt_no = 1;
		List<TagDTO> list = dao.tagMemberList(pjt_no);
		//�깭洹명븷 �븷�뱾 由ъ뒪�듃濡� �꽭�똿�븳�떎
		request.setAttribute("tagMember", list);
		return list;
	}
	//�븣由쇨�寃� �븯湲�
	public int insertTagNoticeService(HttpServletRequest request)throws Exception {
		TagDTO tag = new TagDTO();
		//�깭洹몃꽆踰� 媛��졇�삩�떎
		int tagNum = dao.tagNum();
		//�깭洹몃꽆踰� �뀑�똿�븳�떎
		tag.setTag_no(tagNum);
		//�옉�꽦�옄�꽆踰� 媛��졇�삩�떎. �쉶�썝1.1�씠�윴�떇�쑝濡� �릺�뼱�엳�떎.
		String test = request.getParameter("t.info_no");
		//.�쓽 �쐞移섎�� 李얜뒗�떎.
		int start = test.indexOf('.');
		//.�쓽 �쐞移� �떎�쓬遺��꽣 �걹源뚯� 異붿텧�븳�떎
		String test1 = test.substring(start + 1, test.length());
		//留뚯빟 洹� 媛믪씠 �븘臾닿쾬�룄 �뾾�떎硫� 濡ㅻ갚�븳�떎.
		if(test1 =="") {
			return -1;
		}else {
			//媛믪씠 �엳�떎硫� �옉�꽦�옄 �꽆踰꾨�� �뀑�똿�븳�떎
			tag.setInfo_no(Integer.parseInt(test1));
			//�깭洹몃맆�닔 �엳�뒗�븷�뱾�쓽 �넗�깉�꽆踰꾨�� 媛��졇�삩�떎
			int tag_total_m_no = dao.tag_total_m_no(tag);
			//�넗�깉�꽆踰꾨�� �뀑�똿�븳�떎
			tag.setTotal_m_no(tag_total_m_no);
			//�븣�엺�씠 媛��룄濡앺븳�떎
			return dao.insertTagNotice(tag);
		}
		
	}
	
}

