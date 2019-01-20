package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;
import com.service.Board;

public class InsertAction20 implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CheckListDao dao = CheckListDao.getInstance();
		request.setCharacterEncoding("utf-8");
		
		Board board = new Board();
		board.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		board.setList_info(request.getParameter("list_info"));

		dao.insertlist(board);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list20.do");
		return forward;
	}

}
