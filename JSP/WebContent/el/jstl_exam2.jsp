<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="fruit" value="${param.fruit}"></c:set>
	
	<c:if test="${fruit == 'apple'}">
		<c:out value="${fruit }"></c:out>
	</c:if>	
	
	<c:choose>
		<c:when test="${fruit == 'apple'}">
			<c:out value="${fruit }: 사과"></c:out>
		</c:when>
		<c:when test="${fruit == 'orange'}">
			<c:out value="${fruit }: 오렌지"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="${fruit}: 기타과일"></c:out>
		</c:otherwise>
	</c:choose>
	
	<c:set var ="now" value ="<%= new Date() %>"></c:set>
	
	before : ${now }<br>
	after : <fmt:formatDate value="${now }" pattern = "yyyy-MM-dd"/><br><br>
	
	before: ${50000000000 }원<br>
	after:<fmt:formatNumber value="${50000000000  }" 
			type = "currency" currencySymbol="$"></fmt:formatNumber>	<br>
			
			
	<fmt:formatNumber value="0.9" type="percent"/><br>
	<fmt:formatNumber value = "3.1438832" pattern="#.00"/><br>
	
</body>
</html>
