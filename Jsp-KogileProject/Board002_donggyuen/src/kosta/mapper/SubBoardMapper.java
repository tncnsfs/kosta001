package kosta.mapper;

import java.util.List;

import kosta.model.SubBoard;

public interface SubBoardMapper {

	List<SubBoard> subListBoard(int seq);
	int subInsertBoard(SubBoard board);
	int subDeleteBoard(SubBoard board);
}
