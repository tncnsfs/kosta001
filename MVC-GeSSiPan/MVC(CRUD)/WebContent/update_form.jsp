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
		<input type="hidden" name="seq" value="${board.seq }"> <!-- �۹�ȣ�� �������� ������ ���� ������ �ؾ��ϴµ� �۹�ȣ�� �Ѱ�����Ѵ�. ȭ�鿡 ������ ������ ���δ�. ����صα�!!! -->
	�ۼ��� : ${ board.writer} %><br>
	���� : <input type="text" name="title" value="${board.title }"><br>
	���� <br>
	<textarea rows="6" cols="70" name="contents">${board.contents }</textarea>
	<br>
	<input type="submit" value="�����Ϸ�">
</form>
</body>
</html>