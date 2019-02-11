<%@page import="kosta.model.ListModel"%>
<%@page import="kosta.model.BoardService"%>
<%@page import="kosta.model.Search"%>
<%@page import="kosta.model.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosta.model.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
 <%
 	request.setCharacterEncoding("utf-8");
 
 	String pageNum = request.getParameter("pageNum");
 	if(pageNum == null){
 		pageNum = "1";
 	}
 	
 	int requestPage = Integer.parseInt(pageNum);
 	
 	BoardService service = BoardService.getInstance(); 	  	
 	
 	ListModel listModel = service.listBoardService(requestPage, request);
 	request.setAttribute("listModel", listModel);		
 	 
 	//BoardDao2 dao = BoardDao2.getInstance();
 	//List<Board> list = dao.listBoard(search);
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
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
			<td>이미지</td>
		</tr>
			<c:forEach var="board" items="${listModel.list }">
			<tr>
				<td>${board.seq }</td>
				<td><a href="detail.do?seq=${board.seq }">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>					
					<fmt:parseDate var="dateString" value="${board.regdate }" pattern="yyyy-MM-dd"/>
					<fmt:formatDate value="${dateString }" pattern="yyyy-MM-dd"/>
				</td>
				<td>${board.hitcount }</td>
			</tr>
			
							<td>
					<c:if test="${board.fname != null }">
						<c:set var="head" value="${fn:substring(board.fname, 
												0, fn:length(board.fname)-4) }"></c:set>
						<c:set var="pattern" value="${fn:substring(board.fname, 
						fn:length(head) +1, fn:length(board.fname)) }"></c:set>
					
						<c:choose>
							<c:when test="${pattern == 'jpg' || pattern == 'gif' }">
								<img src="upload/${head }_small.${pattern}">
							</c:when>
							<c:otherwise>
								<c:out value="NO IMAGE"></c:out>
							</c:otherwise>
						</c:choose>
					</c:if>
				</td>
			</c:forEach>
	</table>
	<br><br>
	
	<!-- 페이징 처리 영역 -->
	<!-- 이전 -->
	<c:if test="${listModel.startPage >5 }">
		<a href="list.jsp?pageNum=${listModel.startPage-1 }">[이전]</a>
	</c:if>
	<!-- 페이지 목록 -->
	<c:forEach var="pageNo" begin="${listModel.startPage }" end="${listModel.endPage }">
		<c:if test="${listModel.requestPage == pageNo }"><b></c:if>
			<a href="list.jsp?pageNum=${pageNo }">[${pageNo }]</a>
		<c:if test="${listModel.requestPage == pageNo }"></b></c:if>
	</c:forEach>
	<!-- 이후 -->
	<c:if test="${listModel.endPage < listModel.totalPageCount }">
		<a href="list.jsp?pageNum=${listModel.startPage + 5 }">[이후]</a>
	</c:if>
	
		
		<form action="list.jsp" method="post">
			<input type="checkbox" name="area" value="title">제목
			<input type="checkbox" name="area" value="writer">작성자
			<input type="text" name="searchKey" size="10"></input>
			<input type="submit" value="검색">
		</form>
</body>
</html>



