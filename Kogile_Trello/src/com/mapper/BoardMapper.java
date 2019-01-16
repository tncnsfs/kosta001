package com.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.service.Board;
import com.service.Search;

public interface BoardMapper {
	int insertchecklist(Board board);
	
	List<Board> listBoard(RowBounds row, Search search);
	int countBoard(Search search);

	
	
	/*List<Board> listBoard(Search search);
	Board detailBoard(int seq);
	int updateBoard(Board board);
	int deleteBoard(Board board);*/
	
}
