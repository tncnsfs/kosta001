package com.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CheckListDao;

public class CheckListService {
	
	private static CheckListService service = new CheckListService();
	private static CheckListDao dao;
	
	public static CheckListService getInstance() {
		dao = CheckListDao.getInstance();
		return service;
	}
	
	public int insertCheckListBoard(HttpServletRequest request)throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		Board board = new Board();
		
		board.setCheck_title(request.getParameter("check_title"));
		System.out.println("check_title: " + board.getCheck_title());
		
		return dao.insertchecklist(board);
		
	}
	
	
	

}
