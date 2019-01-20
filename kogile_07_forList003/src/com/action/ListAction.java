package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;
import com.service.Board;
import com.service.CheckListService;
import com.service.ListModel;
//import com.service.CheckListService;
//import com.service.ListModel;
import com.service.Search;

public class ListAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		CheckListService service = CheckListService.getInstance();
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null) {
			pageNum ="1";
		}
		int requestPage = Integer.parseInt(pageNum);
		ListModel listModel = service.listBoardService(requestPage, request);
		request.setAttribute("listModel", listModel);
		

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("list.jsp");

		return forward;
	}

}
