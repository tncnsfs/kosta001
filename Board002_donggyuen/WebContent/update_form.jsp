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
<form action="updateAction.do" method="post">
<input type ="hidden" name="seq" value="${one.seq}">
	<table width="500" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>제목 : <input type="text" name="title" value="${one.title}"></td>
						<td>작성자 : ${one.writer}</td>
						<td>비밀번호 : <input type="text" name="pass" value=""></td>
		</tr>
		<tr >
			<td colspan="3" >
				<textarea rows="6" cols="70" name="contexts">${one.contexts}</textarea>
			</td>
		</tr>
		<tr>
					<td colspan="3">작성일 : ${one.regdate}</td>
		</tr>
		<tr>
						<td colspan="3">조회수 : ${one.hitcount}</td>
			</tr>

	</table>

	<input type="submit" value="수정완료">
</form>
	<a href ="list.do"><input type="button" value ="취소" ></a>
</body>
</html>








