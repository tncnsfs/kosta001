<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
 <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	
	<table class="table-striped"width="500" border="1" cellpadding="0" cellspacing="0">

		<c:forEach var="notice" items="${list5}">
			<tr>
				<td>${notice.contents}</td>
				<td>${notice.day}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>