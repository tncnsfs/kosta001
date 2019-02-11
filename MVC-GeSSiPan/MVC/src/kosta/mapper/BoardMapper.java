package kosta.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import kosta.model.Board;
import kosta.model.Search;

public interface BoardMapper {
	int insertBoard(Board board);
	
	List<Board> listBoard(RowBounds row, Search search);
//	List<Board> listBoard(Search search);
	Board detailBoard(int seq);
	
	int updateBoard(Board board);
	int deleteBoard(Board board);
	int countBoard(Search search);
}
