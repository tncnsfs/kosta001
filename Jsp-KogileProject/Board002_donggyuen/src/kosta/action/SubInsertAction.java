package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.SubBoardService;

public class SubInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SubBoardService service = SubBoardService.getInstance();
		service.subInsertBoardService(request);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("detail.do");
		return forward;
	}

}
