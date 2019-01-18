<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기</h3>
<hr>
<form action="insertAction.do" method="post" >
	체크리스트 : <input type="text" name="check_title"><br>
	<br>
	<input type="submit" value="등록">
</form>

<form action = "insertAction2.do" method = "post">
	하위리스트: <input type="text" name = "check_list"><br>
	<br>
	<input type = "submit" value = "등록2"> 
</form>

</body>
</html>




