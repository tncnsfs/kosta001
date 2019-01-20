package com.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.service.Board;
import com.service.Board2;
import com.service.Search;

public interface BoardMapper {
	
	int insertlist(Board2 board2);
	List<Board2> listBoard2(RowBounds row, Search search);
	int countBoard2(Search search);
	Board2 detailBoard2(int list_no);
	int updateBoard2(Board2 board2);
	int deleteBoard2(Board2 board2);
	
	/*
	 * 	List<Board> listBoard(Search search);
	 * List<Board> listBoard(RowBounds row, Search search);
		
	*/
	
	int insertchecklist(Board board);
	List<Board> listBoard(RowBounds row, Search search);
	int countBoard(Search search);
	Board detailBoard(int checklist_no);
	int updateBoard(Board board);
	int deleteBoard(Board board);



	

}
