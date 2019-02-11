package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao2;

public class DeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao2 dao = BoardDao2.getInstance();
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		board.setSeq(Integer.parseInt(request.getParameter("seq")));
		
		dao.deleteBoard(board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list.do");
		return forward;
	}

}
