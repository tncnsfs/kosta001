package com.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;

public class CheckListService {
	
	private static CheckListService service = new CheckListService();
	private static CheckListDao dao;
	private static final int PAGE_SIZE =2 ;
	
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

	public ListModel listBoardService(int requestPage, HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		Search search = new Search();
		HttpSession session = request.getSession();
		
		//검색시
		if(request.getParameterValues("area") != null) {
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey('%' + request.getParameter("searchKey")+ '%');
			session.setAttribute("search", search);
		}
		
		// 검색후 페이지 클릭
		else if((Search) session.getAttribute("search") != null) {
			search = (Search) session.getAttribute("search");
		}
		
		// 페이지당 글갯수, 총 글갯수, 총페이지수, 현재페이지
		// 시작페이지, 마지막페이지 , startRow, endRow 
		
		// 총글갯수 구하기
		int totalCount = dao.countBoard(search);
		
		
		// 총 페이지수 구하기
		int totalPageCount = totalCount/PAGE_SIZE;
		
		// 시작페이지, 마지막페이지 구하기 
		// 시작페이지 = 현재페이지 (현재페이지 -1) %5
		int startPage = (requestPage - 1) % 5;
		
		// 마지막페이지 구하기
		// 마지막페이지 = 시작페이지(현재페이지 +4) -> 디폴트 값이 5페이지 기준 
		int endPage = startPage + 4;
		if(endPage > totalPageCount) {
			endPage = totalPageCount;
		}
		
		
		
		// starRow 시작글 구하기: (현재페이지 -1) * 페이디장 글갯수
		int startRow = (requestPage -1)* PAGE_SIZE;
		List<Board> list = dao.listboard(search, startRow);
		
		ListModel listModel = new ListModel(list, requestPage, totalPageCount, startPage, endPage);
		
		
		
		return listModel;
	}
	
	
	

}
