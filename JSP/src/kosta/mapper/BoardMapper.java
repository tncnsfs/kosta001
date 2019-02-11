package kosta.mapper;

import java.util.List;

import kosta.bean.Board;
import kosta.bean.Search;

public interface BoardMapper {
	int insertBoard(Board board);
	
	List<Board> listBoard(Search search);
	Board detailBoard(int seq);
	
	int updateBoard(Board board);
	int deleteBoard(Board board);
}
