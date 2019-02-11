package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao2;

public class DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao2 dao = BoardDao2.getInstance();
		request.setCharacterEncoding("utf-8");
		
		String str = request.getParameter("seq");
		int seq = 0;
		if(str != null){
			seq = Integer.parseInt(str);
		}
		
		Board board = dao.detailBoard(seq);
		System.out.println(board);
		request.setAttribute("board", board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("detail.jsp");
		
		return forward;
	}

}
