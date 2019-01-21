package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import com.dao.ListDao;

public class ListService {
	private static ListDao dao;
	private static ListService service = new ListService();
	
	public static ListService getInstance(){
		dao = ListDao.getInstance();
		return service;
	}
	
	public int insertlist(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		ListBoard listboard = new ListBoard();
		listboard.setList_info(request.getParameter("list_info"));
		int checklist_no = Integer.parseInt(request.getParameter("checklist_no"));
		listboard.setChecklist_no(checklist_no);
		
		return dao.insertlist(listboard);
	}
	
//	----------------------------------------------------------------------------------------
	public ListBoard detailBoardService20(HttpServletRequest request)throws Exception{
		ListBoard listboard = null;
		int list_no  = Integer.parseInt(request.getParameter("list_no"));
		int checklist_no = Integer.parseInt(request.getParameter("checklist_no"));
		System.out.println("checklist_no" + checklist_no);
		listboard = dao.detailBoard20(checklist_no);
		
		return listboard;
	}

//	----------------------------------------------------------------------------------------
	public List<ListBoard> listBoardService20(int requestPage, HttpServletRequest request) throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		int checklist_no = Integer.parseInt(request.getParameter("checklist_no"));
		System.out.println(checklist_no);
		
		List<ListBoard> list = dao.listBoard20(checklist_no);
		request.setAttribute("checklist", list);
				
		return list;
	}
	
	
}
