package kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.Action;
import kosta.action.ActionForward;
import kosta.action.InsertAction;
import kosta.action.InsertForm;
import kosta.action.SubInsertAction;
import kosta.action.deleteAction;
import kosta.action.deleteForm;
import kosta.action.detailForm;
import kosta.action.listForm;
import kosta.action.updateAction;
import kosta.action.updateForm;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doProsses(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// URI 위치 설정
		// 방법 1
		
		 /*String requestURI = request.getRequestURI();
		 System.out.println(requestURI); String contextPath =
		 request.getContextPath(); System.out.println(contextPath); String
		 command = requestURI.substring(contextPath.length()+1);
		 System.out.println(command);
		 */
		// 방법2
		String path1 = request.getServletPath();
		// System.out.println(path1);
		String command = path1.substring(1);
		// System.out.println(command2);
		 
		Action action = null;
		ActionForward forward = null;

		if (command.equals("insertForm.do")) {
			// service나 기능을 실행
			action = new InsertForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("insertAction.do")){
			action = new InsertAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("list.do")){
			action = new listForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("detail.do")){
			action = new detailForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("updateForm.do")){
			action = new updateForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("updateAction.do")){
			action = new updateAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("deleteForm.do")){
			action = new deleteForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("deleteAction.do")){
			action = new deleteAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("subInsertAction.do")){
			action = new SubInsertAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// isRedirct 와 path 에 따라 진행 방향 결정
		if (forward != null){
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProsses(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProsses(request, response);
	}
}
