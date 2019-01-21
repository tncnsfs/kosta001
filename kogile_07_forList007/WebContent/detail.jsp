
<%@page import="com.service.ListService"%>
<%@page import="com.service.CheckListService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<ul>
		<li>제목:${board.check_title }</li>
		<li>체크_넘버 : ${board.checklist_no }</li> 
		<li>
			<br>
			<a href="insert_form.do?checklist_no=${board.checklist_no }">등록</a>
			<a href="updateForm.do?checklist_no=${board.checklist_no }">수정</a>
			<a href="delete.do?checklist_no=${board.checklist_no }">삭제</a>
			<a href="list.do">목록</a>
		</li>
	</ul>
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>리스트내용</td>
		</tr>
		<form action="insertAction20.do?list_no=${listboard.list_no }" method="post">
		<input type="hidden" name="checklist_no" value="${listboard.checklist_no }">
			 	list제목: <input type="text" name="list_info">
				<input type="submit" value="등록">
		</form>
		<c:forEach var="board" items="${listModel.list }">
			<tr>
				<td><a href="detail20.do?list_no=${listboard.list_no }">${listboard.list_info }</a></td>
			</tr>
		</c:forEach>
	</table>
	
	
	<br>
	<a href="detail20.do">수정</a>
	
</body>
</html>
