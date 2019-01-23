
<%@page import="com.service.ListBoard"%>
<%@page import="java.util.List"%>
<%@page import="com.service.ListService"%>
<%@page import="com.service.CheckListService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	ListService listservice = ListService.getInstance();
	
	List<ListBoard> list = listservice.listBoardService20(request);
	request.setAttribute("list", list);
%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<ul>
		<li>제목:${detailboard.check_title }</li>
		<li>체크참조번호 : ${detailboard.checklist_no }</li> 
		<%-- <li>체크_넘버1 : ${list.checklist_no }</li> --%> 
		<li>
			<a href="insert_form.do?checklist_no=${detailboard.checklist_no }">등록</a>
			<a href="updateForm.do?checklist_no=${detailboard.checklist_no }">수정</a>
			<a href="delete.do?checklist_no=${detailboard.checklist_no }">삭제</a>
			<a href="list.do">목록</a>
		</li>
		
	<h3>글목록보기</h3>
	<a href="list20.jsp">댓글</a>		<br>

	<a href="list.do">목록보기</a>
	
	<br><br>
	
	
</body>
</html>
