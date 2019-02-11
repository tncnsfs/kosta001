<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   	String body = request.getParameter("body");
    if(body == null){
    	body ="../main.jsp";
    }
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="logo.jsp"></jsp:include>
	<hr>
	<jsp:include page="header.jsp"></jsp:include>
	<hr>
	<jsp:include page="menu.jsp"></jsp:include>
	<hr>
	<jsp:include page="<%= body %>"></jsp:include>
	<hr>
	<jsp:include page="footer.jsp"></jsp:include>
	<hr>
	
</body>
</html>