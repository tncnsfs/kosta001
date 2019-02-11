package koata.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet2")
public class FormServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormServlet2() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int num3 = Integer.parseInt(request.getParameter("num3"));
		
		int result2 = 0;
		for(int i =0; i< num3; i++){
			result2 += i;
		};
		
		request.setAttribute("result20", result2);
		
		RequestDispatcher re2 = 
				request.getRequestDispatcher("/jsp2/result2.jsp");
		re2.forward(request, response);
		
		
		
	}
	
}
