package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.BoardService;
import kosta.model.SubBoardService;

public class detailForm implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		SubBoardService service2 = SubBoardService.getInstance();
		service.detailBoardService(request);
		service2.subListBoardService(request);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("detail.jsp");
		
		// TODO Auto-generated method stub
		return forward;
	}

}
