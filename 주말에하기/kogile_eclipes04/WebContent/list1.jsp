<%@page import="com.service.ListModel"%>
<%@page import="com.service.CheckListService"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Board" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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
	<h3>글목록보기</h3>
	<a href="insert_form.jsp">글쓰기</a>
	
		<form action="insertAction.do" method="post">
		test001 : <input type="text" name="check_title"><br> <br>
		<input type="submit" value="등록">
	</form>
	
	
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>체크리스트 제목</td>
		</tr>
		<br>
		
		<c:forEach var="board" items="${listModel.list }">
			<tr>
				<td><a href="detail.do?checklist_no=${board.checklist_no }">${board.check_title }</a></td>
<%-- 				 <c:forEach var = "board" items = ${listModel.list }>
					<tr>
						<td>${board.checklist_no }</td>
					</tr>
				 </c:forEach> --%>

			</tr>
		</c:forEach>
	</table>





	<form action="list.do" method="post">
		<input type="checkbox" name ="area" value = "check_title">제목검색
		<input type="text" name="searchKey" size="10"></input>
		<input type="submit" value="검색">
	</form>
	
</body>
</html>