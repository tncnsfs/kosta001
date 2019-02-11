package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.BoardService;
import kosta.model.SubBoardService;

public class deleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String seq = request.getParameter("seq");
		//String pass = request.getParameter("pass");
		System.out.println(seq);

		SubBoardService service2 = SubBoardService.getInstance();
		service2.deleteSubBoardService(request);
		
		
		BoardService service = BoardService.getInstance();
		service.deleteBoardService(request);
		//SubBoardService service2 = SubBoardService.getInstance();
		//service2.deleteSubBoardService(request);
		
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(true);
		forward.setPath("list.do");
		
		// TODO Auto-generated method stub
		return forward;
	}

}
