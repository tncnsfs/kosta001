<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글목록 보기</h3>
	<a href="insertForm.do">글쓰기</a>
	<table width="500" border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	
	<c:forEach var="board" items="${list }">
		<tr>
			<td>${board.seq }</td>
			<td><a href="detail.do?seq=${board.seq }">${board.title }</a></td>
			<td>${board.writer }</td>
			<td>
			<fmt:parseDate var="dateString" value="${board.regdate }" pattern ="yyyy-MM-dd"/>
			<fmt:formatDate value="${dateString }" pattern="yyyy-MM-dd"/>
			</td>
			<td>${board.hitcount }</td>
		</tr>
	</c:forEach>
	
	</table>
	<br><br>
	
	<form action="list.do" method="post">
		<input type="checkbox" name="area" value="title">제목
		<input type="checkbox" name="area" value="writer">작성자
		<input type="text" name="searchKey" size="10"></input>
		<input type="submit" value="검색">
	</form>
	<!-- getParameterValues를 사용해서 값들을 따올수 있다. -->
	
</body>
</html>