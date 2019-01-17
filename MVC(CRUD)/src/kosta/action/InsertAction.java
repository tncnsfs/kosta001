package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao2;

public class InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao2 dao = BoardDao2.getInstance();
		
		request.setCharacterEncoding("utf-8");
		
		Board board = new Board();
		board.setContents(request.getParameter("contents"));
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		
		dao.insertBoard(board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true); // 리다이렉트를 해줘야한다.
		forward.setPath("list.do"); // 또 다른 요청이기 때문에 list.do!!
		
		return forward;
	}

}
