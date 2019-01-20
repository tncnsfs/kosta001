package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ListDao;
import com.service.Board;
//import com.service.CheckListService;
import com.service.Board2;

public class InsertAction2 implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ListDao dao = ListDao.getInstance();
		request.setCharacterEncoding("utf-8");
		
		Board2 board2 = new Board2();
		board2.setList_info(request.getParameter("list_info"));
		
		dao.insertlist(board2);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list.do");
		return forward;
	}

}
