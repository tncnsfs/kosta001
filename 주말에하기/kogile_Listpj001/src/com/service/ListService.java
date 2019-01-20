package com.service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;
import com.dao.ListDao;


public class ListService {
	private static ListDao dao;
	private static ListService service = new ListService();
	private static final int PAGE_SIZE = 2;
	
	public static ListService getInstance(){
		dao = ListDao.getInstance();
		return service;
	}
	
//	----------------------------------------------------------------------------------------
	public Board2 detailBoardService(HttpServletRequest request)throws Exception{
		Board2 board2 = null;
		int list_no  = Integer.parseInt(request.getParameter("list_no"));
		board2 = dao.detailBoard2(list_no);
		
		return board2;
	}
	
//	----------------------------------------------------------------------------------------
	public ListModel2 listBoardService(int requestPage, HttpServletRequest request) throws Exception{
		
		Search search = new Search();
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();

		if(request.getParameterValues("area") != null){
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey('%'+request.getParameter("searchKey")+'%');
			session.setAttribute("search", search);
		}
		
		else if((Search)session.getAttribute("search") != null){
			search = (Search)session.getAttribute("search");
		}
		
		
		int totalCount = dao.countBoard2(search);
		
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE > 0){
			totalPageCount++;
		}
		
		int startPage = requestPage - (requestPage -1) % 5;
		int endPage = startPage + 4;
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
		
		int startRow = (requestPage -1)* PAGE_SIZE;
		List<Board2> list = dao.listBoard2(search, startRow);
		ListModel2 listModel2 = new ListModel2(list, requestPage, totalPageCount, startPage, endPage); 
		
		return listModel2;
	}
	

}
