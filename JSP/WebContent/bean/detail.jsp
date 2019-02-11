<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
// 	   int seq = Integer.parseInt(request.getParameter("seq")); 
 	   
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

	<ul>
		<li>글번호: <%= board.getSeq() %></li>
		<li>제목: <%= board.getTitle() %></li>
		<li>작성자: <%= board.getWriter() %></li>
		<li>내용: <%= board.getContents() %></li>
	</ul>
	<br>
	
	<a href= "updateForm.jsp?seq=<%= board.getSeq() %>">수정하기</a>
	<a href= "delete.jsp?seq=<%= board.getSeq() %>">삭제하기</a>
	
</body>
</html>


