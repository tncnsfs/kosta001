package com.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.service.Board;
import com.service.ListBoard;
import com.service.Search;

public interface ListBoardMapper {
	
	int insertlist(ListBoard listboard);
	
	List<ListBoard> listBoard20();
	
	ListBoard detailBoard20(int list_no);
	
	int updateBoard20(ListBoard listboard);
	
	int deleteBoard20(ListBoard listboard);

	
	
}
