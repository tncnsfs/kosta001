package com.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;


public class CheckListService {
	private static CheckListDao dao;
	private static CheckListService service = new CheckListService();
	private static final int PAGE_SIZE = 2;
	
	public static CheckListService getInstance(){
		dao = CheckListDao.getInstance();
		return service;
	}
	
	
//	----------------------------------------------------------------------------------------
	public Board detailBoardService(HttpServletRequest request)throws Exception{
		Board board = null;
		int checklist_no  = Integer.parseInt(request.getParameter("checklist_no"));
		board = dao.detailBoard(checklist_no);
		
		return board;
	}
	
	
public ListModel listBoardService(int requestPage, HttpServletRequest request) throws Exception{
		
		Search search = new Search();
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();

		if(request.getParameterValues("area") != null){
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey('%'+request.getParameter("searchKey")+'%');
			session.setAttribute("search", search);
		}
		else if((Search)session.getAttribute("search") != null){
			search = (Search)session.getAttribute("search");
		}
		
		
		int totalCount = dao.countBoard(search);
		
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE > 0){
			totalPageCount++;
		}
		int startPage = requestPage - (requestPage -1) % 5;
		int endPage = startPage + 4;
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
		
		int startRow = (requestPage -1)* PAGE_SIZE;
		List<Board> list = dao.listBoard(search, startRow);
		ListModel listModel = new ListModel(list, requestPage, totalPageCount, startPage, endPage); 
		
		return listModel;
	}

//	----------------------------------------------------------------------------------------
	
/*	public int insertBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		
		// ?��?�� ?��로드(경로 ?��?��?���?, ?��코등, ?��?��?���? 중첩 ?���?) 
		String uploadPath = request.getRealPath("upload");
		int size = 20 *1024 *1024; // 20MB 
		
		MultipartRequest multi = 
				new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		
		Board board = new Board();
		board.setContents(multi.getParameter("contents"));
		board.setTitle(multi.getParameter("title"));
		board.setWriter(multi.getParameter("writer"));
		
		// ?��?�� ?��로드?�� 
		if(multi.getFilesystemName("fname") != null){
			String fname = multi.getFilesystemName("fname");
			board.setFname(fname);
			
			// ?��?��?�� ?��미�?(jpg, gif) aaa.gif -> aaa_small.gif
			String pattern = fname.substring(fname.indexOf(".")+1);//gif
			String headName = fname.substring(0, fname.indexOf(".")); //aaa.gif
			
			// ?���? File 객체 ?��?�� 
			String imagePath = uploadPath + "\\" + fname; 
			File src = new File(imagePath); // ?���? ?��?�� ?��미�? 만듬 
			
			// ?��?��?�� ?��미�? File 객체 
			String thumImagePath = uploadPath + "\\" + headName + "_small." + pattern; 
			File dest = new File(thumImagePath); 
			
			if(pattern.equals("gif")||pattern.equals("jpg")||pattern.equals("png")){
				ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
			}
			
		}
		return dao.insertBoard(board);
	}*/
	
//	----------------------------------------------------------------------------------------
	
	

}
