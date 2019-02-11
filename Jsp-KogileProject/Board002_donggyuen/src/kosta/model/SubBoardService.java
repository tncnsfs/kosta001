package kosta.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class SubBoardService {
	private static SubBoardDao dao2;
	
	private static SubBoardService service = new SubBoardService();
	
	public static SubBoardService getInstance(){
		dao2 = SubBoardDao.getInstance();
		return service;
	}
	
	public int subInsertBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		
		SubBoard board = new SubBoard();	
	
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContexts(request.getParameter("contexts"));
		board.setSeq(Integer.parseInt(request.getParameter("seq")));
		System.out.println(board);
		
		
		return dao2.subInsertBoard(board);
	}
	
	public List<SubBoard> subListBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		System.out.println(seq);
		
		List<SubBoard> list = dao2.subListBoard(seq);
		request.setAttribute("sublist", list);	
		return list;
	}
	
	public int deleteSubBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		SubBoard board = new SubBoard();
		
		board.setSeq(Integer.parseInt(request.getParameter("seq")));

		System.out.println(board);
		
		
		
		return dao2.deleteSubBoard(board);
	}
	
}
