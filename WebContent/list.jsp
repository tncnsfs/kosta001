<%@page import="com.service.ListModel"%>

<%@page import="java.util.List"%>
<%@page import="com.service.CheckListService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
	request.setCharacterEncoding("utf-8");

	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
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
	
	<a href="insert_form.jsp">제목쓰기</a>	
	<table width="500" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>체크리스트제목</td>
	</tr>
	
	<c:forEach var="board" items="${listModel.list }">
	<tr>
		<td>${board.check_title }</td>
	</tr>
	</c:forEach>
	</table>
	<br><br>
	
	<!-- 페이징 처리 영역 -->
	<!-- 이전 -->
	<c:if test="${listModel.startPage > 5 }">
		<a href="list.jsp?pageNum=${listModel.startPage -1 }" >[이전]</a>
	</c:if>
	
	<!-- 페이지 목록  -->
	<c:forEach var = "pageNo" begin="${listModel.startPage }" end = "${listModel.endPage }">
		<c:if test="${listModel.requestPage == pageNo }"><b></c:if>
			<a href="list.jsp?pageNum = ${pageNo }">[${pageNo }]</a>
		<c:if test="${listModel.requestPage == pageNo }"></b></c:if>
	</c:forEach>
	
	<!-- 이후 -->
	<c:if test="${listModel.endPage < listModel.totalPageCount }">
		<a href="list.jsp?pageNum=${listModel.startPage + 5 }">[이후]</a>
	</c:if>
	
	<form action="list.jsp" method="post">
		<input type="checkbox" name ="area" value = "check_title">제목검색
		<input type="text" name="searchKey" size="10"></input>
		<input type="submit" value="검색">
	</form>
	
</body>
</html>