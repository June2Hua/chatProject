<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! //全局
		String name;
		String pwd;
	%>
	<%
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			if("name".equals(cookie.getName())){
				name=cookie.getValue();
			}
			if("pwd".equals(cookie.getName())){
				pwd=cookie.getValue();
			}
		}
	%>
	<form action="check.jsp" method="post">
		登录名<input type="text" name="name" value="<%=(name==null?"":name) %>"><br/>
		密码<input type="text" name="pwd" value="<%=(pwd==null?"":pwd) %>"><br/>
		<input type="submit" value="登录">
	</form>
</body>
</html>