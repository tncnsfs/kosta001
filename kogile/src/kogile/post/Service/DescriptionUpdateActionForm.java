package kogile.post.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DescriptionUpdateActionForm implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//서비스 객체생성
		PostService service = PostService.getInstance();
		//설명 수정해주는 폼으로 이동하는 서비스
		service.descriptionDetailService(request, response);
		
//		ActionForward forward = new ActionForward();
//		forward.setRedirect(false);
//		forward.setPath("updateDescription.jsp");
		return null;
	}

}
