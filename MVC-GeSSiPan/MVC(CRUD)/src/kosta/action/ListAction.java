package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.model.BoardDao2;
import kosta.model.Search;

public class ListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardDao2 dao = BoardDao2.getInstance();
		request.setCharacterEncoding("utf-8");
		
		Search search = new Search();
		search.setArea(request.getParameterValues("area"));
		search.setSearchKey('%' + request.getParameter("searchKey") + '%');
		
		List<Board> list = dao.listBoard(search);
		request.setAttribute("list", list);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("list.jsp");
		
		return forward;
	}

}
