<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie1=new Cookie("cookie","session");
		Cookie cookie2=new Cookie("page","pageContext");
		Cookie cookie3=new Cookie("exception","config");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		response.sendRedirect("clientTest.jsp");
		//request.getRequestDispatcher("clientTest.jsp").forward(request, response);
	%>
</body>
</html>