<%@page import="kosta.bean.Search"%>
<%@page import="kosta.bean.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	Search search = new Search();
	search.setArea(request.getParameterValues("area"));
	search.setSearchKey('%'+request.getParameter("searchKey")+'%');
		

	BoardDao2 dao = BoardDao2.getInstance(); 
	List<Board> list = dao.listBoard(search);
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h3>글목록 보기</h3>
	<a href= "insert_form.jsp">글쓰기</a>
	<table width = "500" board="1" cellpadding = "0" cellspacing = "0">
		<tr>
			<td>글번호</td>
			<td>작성자</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>	
		
		<% for(int i = 0; i<list.size(); i++){ 
			Board board = list.get(i);
		%>
		<tr>
			 <td><%= board.getSeq()%></td>
			 <td><%= board.getWriter()%></td>
			 <td><a href ="detail.jsp?seq=<%= board.getSeq()%>"><%= board.getTitle()%></a></td>
			 <td><%= board.getContents()%></td>
			 <td><%= board.getRegdate()%></td>
			 <td><%= board.getHitcount()%></td>
		 </tr>
			 <%} %>
	</table>	
	<br><br>
	
	<form action = "list.jsp" method="post">
		<input type = "checkbox" name = "area" value = "title">제목
		<input type = "checkbox" name = "area" value = "writer">작성자
		<input type = "text" name = "searchKey" size = "10"></input>
		<input type = "submit" value = "검색">
	</form>
</body>
</html>

