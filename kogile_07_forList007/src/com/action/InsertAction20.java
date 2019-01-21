package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ListDao;
import com.service.Board;
import com.service.ListBoard;

public class InsertAction20 implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ListDao dao = ListDao.getInstance();
		request.setCharacterEncoding("utf-8");
		
		ListBoard listboard = new ListBoard();
		listboard.setList_info(request.getParameter("list_info"));
		try {
			listboard.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(request.getParameter("list_info"));
		System.out.println(request.getParameter("checklist_no"));

		dao.insertlist(listboard);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list20.do");
		return forward;
	}

}
