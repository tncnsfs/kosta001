package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;
import com.service.CheckListService;

public class InsertAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		CheckListService service = CheckListService.getInstance();
		
		service.insertCheckListBoard(request);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("list.do");
		return forward;
	}

}
