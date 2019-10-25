<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		if("庄锦华".equals(name)&&"123456".equals(pwd)){
			//request.getRequestDispatcher("welcome.jsp").forward(request, response);
			response.sendRedirect("welcome.jsp");
		}else{
			out.print("<font color='blue'>密码输入错误</font>");
		}
	%>
</body>
</html>