<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	
/*  	String name = (String)session.getAttribute("name");
	if(name == null){
		response.sendRedirect("loginForm.jsp");
	} */

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${name } 님 반갑습니다.
	<a href="logout.jsp">로그아웃</a>
</body>
</html>