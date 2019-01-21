package com.mapper;

import java.util.List;
import com.service.ListBoard;

public interface ListBoardMapper {
	

	int insertlist(ListBoard listboard);
	List<ListBoard> listBoard20(int checklist_no);
	int updateBoard20(ListBoard listboard);
	int deleteBoard20(ListBoard listboard);
	ListBoard detailBoard20(int checklist_no);
	
}
