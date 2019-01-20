
<%@page import="com.service.ListModel"%>
<%@page import="com.service.CheckListService"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	request.setCharacterEncoding("utf-8");

	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum= "1";
	}

	int requestPage = Integer.parseInt(pageNum);
	
	CheckListService service = CheckListService.getInstance();
	
	ListModel listModel = service.listBoardService(requestPage, request);
	request.setAttribute("listModel", listModel);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	

	<ul>
		<li>제목:${board.check_title }
	<br>
	<a href="insert_form.do?checklist_no=${board.checklist_no }">등록</a>
	<a href="updateForm.do?checklist_no=${board.checklist_no }">수정</a>
	<a href="delete.do?checklist_no=${board.checklist_no }">삭제</a>
	<a href="list.do">목록</a>
		</li>
	</ul>
	
	
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>리스트 입력</td>
			<form action="insertAction20.do" method="post">
					 	list제목은: <input type="text" name=" list_info"><br><br>
						<input type="submit" value="등록">
			</form>
		</tr>
		<c:forEach var="board" items="${listModel.list }">
			<tr>
				<td><a href="detail20.do?list_no=${board.list_no }">${board.list_info }</a></td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>
