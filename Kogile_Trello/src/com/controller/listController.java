package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.action.Action;
import com.action.ActionForward;
import com.action.InsertAction;
import com.action.InsertActionForm;

@WebServlet("*.do")
public class listController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public listController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		System.out.println("uri" + requestURI + "\n");
		String contextPath = request.getContextPath();
		System.out.println("contextPath :" + contextPath + "\n");
		String command = requestURI.substring(contextPath.length()+1);
		System.out.println("command :" + command + "\n");
		
		Action action = null;
		ActionForward forward = null;
		
		System.out.println("insertcheck01");
		if(command.equals("insertcheck.do")) {
			System.out.println("insertcheck02");
			
			action = new InsertActionForm();
			System.out.println("insertcheck03");
			try {
				forward = action.excute(request, response);
				System.out.println("insertcheck04");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("insertAction.do")) {
			action = new InsertAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		
		if(forward != null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
