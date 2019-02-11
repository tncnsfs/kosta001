<%@page import="kosta.model.Board"%>
<%@page import="kosta.model.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
//int seq = Integer.parseInt(request.getParameter("seq")); 

String str = request.getParameter("seq");
int seq = 0;
if(str != null){
	seq = Integer.parseInt(str);   
}
BoardDao2 dao = BoardDao2.getInstance();
Board board = dao.detailBoard(seq); 
	
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateAction.do" method="post">
		<input type="hidden" name="seq" value="<%= board.getSeq() %>">
	작성자 : <%= board.getWriter() %> <br>
	제목 : <input type="text" name="title" value="<%= board.getTitle() %>"><br>
	내용 <br>
	<textarea rows="6" cols="70" name="contents"><%= board.getContents() %></textarea>
	<br>
	<input type="submit" value="수정완료">
</form>
</body>
</html>


