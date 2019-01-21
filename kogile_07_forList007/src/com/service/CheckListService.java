package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;
import com.dao.ListDao;


public class CheckListService {
	private static CheckListDao dao;
	private static CheckListService service = new CheckListService();
	private static final int PAGE_SIZE = 2;
	
	public static CheckListService getInstance(){
		dao = CheckListDao.getInstance();
		return service;
	}
	
//	----------------------------------------------------------------------------------------
	public List<Board> listBoardService(HttpServletRequest request) throws Exception{
		
		request.setCharacterEncoding("utf-8");
		List<Board> checklist = dao.listBoard();
		System.out.println("checklist" + checklist);
		request.setAttribute("checklist", checklist);
		
		return checklist;
	}

//	----------------------------------------------------------------------------------------
	public int insertchecklist(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		CheckListDao dao = CheckListDao.getInstance();
		
		Board board = new Board();
		board.setCheck_title(request.getParameter("check_title"));
		
		return dao.insertchecklist(board);
	}
	
	//	----------------------------------------------------------------------------------------
	public Board detailBoardService(HttpServletRequest request)throws Exception{
		Board board = null;
		int checklist_no  = Integer.parseInt(request.getParameter("checklist_no"));
		System.out.println("Service+checklist_no" + checklist_no);
		board = dao.detailBoard(checklist_no);
		
		return board;
	}

//	----------------------------------------------------------------------------------------
	public int updateBoard(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		
		board.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		board.setCheck_title(request.getParameter("check_title"));
		
		return dao.updateBoard(board);
	}
	
	public int deleteBoard(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		
		board.setChecklist_no(Integer.parseInt(request.getParameter("checklist_no")));
		
		return dao.deleteBoard(board);
		
	}
	
}
