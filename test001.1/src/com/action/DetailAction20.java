package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;
import com.dao.ListDao;
import com.service.Board;
import com.service.ListBoard;
import com.service.ListService;

public class DetailAction20 implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		ListService serviceDetail20 = ListService.getInstance();
		serviceDetail20.detailBoardService20(request);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("detail20.jsp");

		return forward;
	}

}
