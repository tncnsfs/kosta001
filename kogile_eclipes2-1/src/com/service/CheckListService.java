package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;

public class CheckListService {

	private static CheckListDao dao;
	private static CheckListService service = new CheckListService();
	private static final int PAGE_SIZE = 1;

	public static CheckListService getInstance() {
		dao = CheckListDao.getInstance();
		return service;
	}

	// ----------------------------------------------------------------------------------------
	public Board detailBoardService(HttpServletRequest request) throws Exception {
		Board board = null;
		int checklist_no = Integer.parseInt(request.getParameter("checklist_no"));
		System.out.println("ok" + checklist_no);
		board = dao.detailBoard(checklist_no);

		return board;
	}

	// ----------------------------------------------------------------------------------------

	// ----------------------------------------------------------------------------------------
	public ListModel listBoardService(int requestPage, HttpServletRequest request) throws Exception {

		Search search = new Search();
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();

		// 검색시
		if (request.getParameterValues("area") != null) {
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey('%' + request.getParameter("searchKey") + '%');
			session.setAttribute("search", search);
		}
		// 검색후 페이징 클릭
		else if ((Search) session.getAttribute("search") != null) {
			search = (Search) session.getAttribute("search");
		}

		// 페이지당 글갯수, 총 글갯수, 총페이지수, 현재페이지
		// 시작페이지, 마지막페이지 , startRow, endRow

		// 총글갯수 구하기
		int totalCount = dao.countBoard(search);
		// System.out.println("갯수:" + totalCount);

		// 총페이지수 구하기
		int totalPageCount = totalCount / PAGE_SIZE;
		if (totalCount % PAGE_SIZE > 0) {
			totalPageCount++;
		}
		// System.out.println("페이지갯수:" + totalPageCount);

		// 시작페이지, 마지막페이지 구하기
		// 시작페이지 = 현재페이지 - (현재페이지 -1) % 5
		int startPage = requestPage - (requestPage - 1) % 5;
		int endPage = startPage + 4;
		if (endPage > totalPageCount) {
			endPage = totalPageCount;
		}

		// startRow 시작글 구하기 : (현재페이지 -1) * 페이지당 글갯수
		int startRow = (requestPage - 1) * PAGE_SIZE;
		List<Board> list = dao.listboard(search, startRow);
		// System.out.println("글갯수: " + list.size());
		ListModel listModel = new ListModel(list, requestPage, totalPageCount, startPage, endPage);

		return listModel;
	}
}
