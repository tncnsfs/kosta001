package com.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CheckListDao;

public class CheckListService {
	
	private static CheckListDao dao;
	private static CheckListService service = new CheckListService();
	private static final int PAGE_SIZE = 2;
	
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
		
		//�˻���
		if(request.getParameterValues("area") != null) {
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey('%' + request.getParameter("searchKey")+ '%');
			session.setAttribute("search", search);
		}
		
		// �˻��� ������ Ŭ��
		else if((Search) session.getAttribute("search") != null) {
			search = (Search) session.getAttribute("search");
		}
		
		// �������� �۰���, �� �۰���, ����������, ����������
		// ����������, ������������ , startRow, endRow 
		
		// �ѱ۰��� ���ϱ�
		int totalCount = dao.countBoard(search);
		
		
		// �� �������� ���ϱ�
		int totalPageCount = totalCount/PAGE_SIZE;
		
		// ����������, ������������ ���ϱ� 
		// ���������� = ���������� (���������� -1) %5
		int startPage = (requestPage - 1) % 5;
		
		// ������������ ���ϱ�
		// ������������ = ����������(���������� +4) -> ����Ʈ ���� 5������ ���� 
		int endPage = startPage + 4;
		if(endPage > totalPageCount) {
			endPage = totalPageCount;
		}
		
		
		
		// starRow ���۱� ���ϱ�: (���������� -1) * ���̵��� �۰���
		int startRow = (requestPage -1)* PAGE_SIZE;
		List<Board> list = dao.listboard(search, startRow);
		
		ListModel listModel = new ListModel(list, requestPage, totalPageCount, startPage, endPage);
		
		
		
		return listModel;
	}
	
	
	

}
