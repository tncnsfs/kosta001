package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;
import com.dao.ListDao;
import com.service.Board;
import com.service.ListBoard;

public class UpdateActionForm20 implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ListDao dao = ListDao.getInstance();
		request.setCharacterEncoding("utf-8");

		String str = request.getParameter("list_no");
		int list_no = 0;
		if (str != null) {
			list_no = Integer.parseInt(str);
		}

		ListBoard listboard = dao.detailBoard20(list_no);
		request.setAttribute("listboard", listboard);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false); 
		forward.setPath("update_form20.jsp");
		return forward;
	}

}
