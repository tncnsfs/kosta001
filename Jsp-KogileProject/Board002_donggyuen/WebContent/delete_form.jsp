<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>삭제하시려면 비밀번호를 입력해주세요.</h1>
<form action="deleteAction.do" method="post">
<input type ="hidden" name="seq" value="${one.seq}">
<input type="text" name="pass"/>
	<input type="submit" value="삭제">
</form>
	<a href ="list.do"><input type="button" value ="삭제취소" ></a>
</body>
</html>