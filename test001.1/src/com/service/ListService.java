package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.dao.ListDao;


public class ListService {
	private static ListDao dao;
	private static ListService service = new ListService();
	
	public static ListService getInstance(){
		dao = ListDao.getInstance();
		return service;
	}
	
	public int deleteBoard(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		ListBoard deleteboard20 = new ListBoard();
		deleteboard20.setList_no(Integer.parseInt(request.getParameter("list_no")));
		deleteboard20.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		
		return dao.deleteBoard20(deleteboard20);
	}
	
	public int updateBoard(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		ListBoard updateboard20 = new ListBoard();
		updateboard20.setList_no(Integer.parseInt(request.getParameter("list_no")));
		updateboard20.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		updateboard20.setList_info(request.getParameter("list_info"));
		
		return dao.updateBoard20(updateboard20);
	}
	
	public int insertlist(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		ListBoard insertboard = new ListBoard();
		
		insertboard.setList_info(request.getParameter("list_info"));
		insertboard.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		
		System.out.println("insertboard20" + insertboard);
		System.out.println("test ya: " + insertboard.getList_info() + 
				insertboard.getChecklist_no());
		
		return dao.insertlist(insertboard);
	}
	
//	----------------------------------------------------------------------------------------
	public ListBoard detailBoardService20(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		ListBoard detailboard20 = null;
		
		int list_no  = Integer.parseInt(request.getParameter("list_no"));
		int checklist_no  = Integer.parseInt(request.getParameter("checklist_no"));

		detailboard20 = dao.detailBoard20(checklist_no);
		System.out.println("checklist_no" + checklist_no);
		request.setAttribute("detailboard20", detailboard20);
		
		return detailboard20;
	}

//	----------------------------------------------------------------------------------------
	public List<ListBoard> listBoardService20(HttpServletRequest request) throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		List<ListBoard> list = dao.listBoard20();
		System.out.println("list :" + list);
		
		return list;
	}
//	----------------------------------------------------------------------------------------
	
}
