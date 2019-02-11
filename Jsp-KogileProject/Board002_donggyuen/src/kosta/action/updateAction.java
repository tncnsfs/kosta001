package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.BoardService;

public class updateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		int result = service.updateBoardService(request);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list.do");
		
		// TODO Auto-generated method stub
		return forward;
	}

}
