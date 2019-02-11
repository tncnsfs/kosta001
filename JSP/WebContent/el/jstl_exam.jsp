<%@page import="java.util.ArrayList"%>
<%@page import="kosta.bean.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	  String hello = "Hello";
	%>
	<c:set var="msg" value="Hello2"/>
	<c:out value="${msg}"></c:out><br>
	<c:out value="hello"></c:out>
	
	<!-- 회수가 정해진 케이스 : 구구단  -->
	<ul>
	<c:forEach var="i" begin="1" end="9">
		<li>4 * ${i }= ${4*i }</li>
	</c:forEach>
	</ul>

	<%
	List<Member> list = new ArrayList<>();
	list.add(new Member("aa","aa","aa","19"));
	list.add(new Member("bb","bb","bb","29"));
	
	request.setAttribute("list", list);
	%>	
	
	<table border="1">
	<tr>
		<th>아이디</th>
		<th>비번</th>
		<th>이름</th>
		<th>나이</th>
	</tr>
	<c:forEach var="m" items="${list}">
	<tr>
		<th>${m.id}</th>
		<th>${m.pass}</th>
		<th>${m.name}</th>
		<th>${m.age}</th>
	</tr>
	</c:forEach>	
	</table>
	
	<c:redirect url = "jstl_exam2.jsp">
		<c:param name="fruit" value="orange"></c:param>
	</c:redirect>
	
</body>
</html>