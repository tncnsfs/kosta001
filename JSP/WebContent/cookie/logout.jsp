<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();

	if(cookies != null){
		for(int i =0; i<cookies.length; i++){
			if(cookies[i].getName().equals("name")){
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
				
			}else if(cookies.length == 1 
					&& cookies[i].getName().equals("JSESSIONID")){
			response.sendRedirect("loginForm.jsp");
			}
		}
		
	}else{
		response.sendRedirect("loginForm.jsp");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>