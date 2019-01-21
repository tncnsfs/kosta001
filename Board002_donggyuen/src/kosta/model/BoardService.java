package kosta.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class BoardService {
	private static BoardDao dao;

	private static BoardService service = new BoardService();
	
	public static BoardService getInstance(){
		dao = BoardDao.getInstance();
		return service;
	}
	
	
	//메소드 작성(서비스기능등)
	public int insertBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		
		Board board = new Board();	
		board.setPass(request.getParameter("pass"));
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContexts(request.getParameter("contexts"));	
		//System.out.println(board);
		return dao.insertBoard(board);
	}
	
	public List<Board> listBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		List<Board> list = dao.listBoard();
		System.out.println(list);
		request.setAttribute("list", list);	

		return list;
	}
	
	public void detailBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		Board board = new Board();
		board = dao.detailBoard(seq);
		dao.hitcount(board);
		
		request.setAttribute("one", board);
	}
	
	public int updateBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");

		Board board = new Board();
		
		board.setSeq(Integer.parseInt(request.getParameter("seq")));
		board.setPass(request.getParameter("pass"));
		board.setTitle(request.getParameter("title"));
		board.setContexts(request.getParameter("contexts"));
		System.out.println(board);

		return dao.updateBoard(board);
	}
	
	public int deleteBoardService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		Board board = new Board();
		
		board.setSeq(Integer.parseInt(request.getParameter("seq")));
		String pass = request.getParameter("pass");
		System.out.println(pass);
		System.out.println();
		System.out.println(board);
		
		return dao.deleteBoard(board);
	}
}
