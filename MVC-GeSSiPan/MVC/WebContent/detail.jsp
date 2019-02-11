

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<li>글번호:${board.seq }</li>
		<li>제목:${board.title }</li>
		<li>작성자:${board.writer }</li>
		<li>내용:${board.contents }</li>
		<li>파일:<a href="download.jsp?filename=${board.fname }">${board.fname }</a></li>
	</ul>
	<br>
	<a href="updateForm.do?seq=${board.seq }">수정하기</a>
	<a href="delete.do?seq=${board.seq }">삭제하기</a>
	<a href="list.do">목록보기</a>
</body>
</html>
