<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("name")+"<br/>";
	out.print(name);
	String id=request.getParameter("id");
	out.print(id);
	String[] subjects=request.getParameterValues("subjects");
	out.print(name+"<br/>");
	out.print(id+"<br/>");
	if(subjects!=null)
		for(String subject:subjects)
			out.print(subject+"<br/>");
	%>
	<br/>
	<br/>
	
	姓名为：<%=name %>
	姓名为：<%=name %>
	学号为：<%=id %>
	
</body>
</html>