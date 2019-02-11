<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글 디테일</h3>

	<a href="list.do">글목록</a>
	<br>

	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>제목 : ${one.title}</td>
			<td>작성자 : ${one.writer}</td>
		</tr>
		<tr>
			<td colspan="2">${one.contexts}</td>
		</tr>
		<tr>
			<td colspan="2">작성일 : ${one.regdate}</td>
		</tr>
		<tr>
			<td colspan="2">조회수 : ${one.hitcount}</td>
		</tr>
	</table>
	<br>
	<a href="updateForm.do?seq=${one.seq}">
		<input type="button" value="수정">
	<a href="deleteAction.do?seq=${one.seq}">
		<input type="button" value="삭제"></a>

	<br>
	<br>
	<br>


	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="2">댓글</th>
		</tr>
		<c:forEach var="l" items="${sublist}">
			<!-- items는 setAttribute 의 값을 가져온다 -->
			<tr>
				<td>작성자 : ${l.writer}</td>
				<td>작성일 : <fmt:parseDate var="dateString" value=" ${l.regdate}" pattern="yyyy-MM-dd"/>
			<fmt:formatDate value="${dateString}" pattern="yyyy-MM-dd"/></td>
			</tr>
			<tr>
				<td colspan="2">${l.contexts}</td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<br>

	<form action="subInsertAction.do" method="post">
		<input type="text" name="seq" value="${one.seq}" /> 
		작성자 : <input type="text" name="writer"><br> 
		제목 : <input type="text" name="title"/><br> 
		내용 <br> <textarea rows="6" cols="70" name="contexts"></textarea><br> 
		<input type="submit" value="댓글등록">
	</form>
</body>
</html>