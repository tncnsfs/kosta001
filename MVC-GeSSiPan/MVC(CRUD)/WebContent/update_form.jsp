<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="updateAction.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }"> <!-- 글번호를 가져오는 이유는 실제 수정을 해야하는데 글번호를 넘겨줘야한다. 화면에 보이지 않지만 쓰인다. 기억해두기!!! -->
	작성자 : ${ board.writer} %><br>
	제목 : <input type="text" name="title" value="${board.title }"><br>
	내용 <br>
	<textarea rows="6" cols="70" name="contents">${board.contents }</textarea>
	<br>
	<input type="submit" value="수정완료">
</form>
</body>
</html>