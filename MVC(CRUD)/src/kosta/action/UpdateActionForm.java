package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao2;

public class UpdateActionForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao2 dao = BoardDao2.getInstance();
		request.setCharacterEncoding("utf-8");

		String str = request.getParameter("seq");
		int seq = 0;
		if (str != null) {
			seq = Integer.parseInt(str);
		}

		Board board = dao.detailBoard(seq);
		request.setAttribute("board", board);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false); // 리다이렉트 시키지 않을것이기 때문에 false
		forward.setPath("update_form.jsp");
		return forward;
	}

}
