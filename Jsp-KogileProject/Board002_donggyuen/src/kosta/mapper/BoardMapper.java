package kosta.mapper;

import java.util.List;

import kosta.model.Board;

public interface BoardMapper {
	
	List<Board> listBoard();
	Board detailBoard(int seq);
	int insertBoard(Board board);
	int updateBoard(Board board);
	int deleteBoard(Board board);
	int hitCount(Board board);
	

}
