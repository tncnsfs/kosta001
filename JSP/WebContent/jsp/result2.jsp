<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));

	int result = num1 + num2;
  	request.setAttribute("result", result); 
 %>


<!-- 디스패쳐  포워드-->
<jsp:forward page="result.jsp"></jsp:forward>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	결과2: <%= result %>
	
	<%
	//	 response.sendRedirect("table.jsp");
	%>
</body>
</html>