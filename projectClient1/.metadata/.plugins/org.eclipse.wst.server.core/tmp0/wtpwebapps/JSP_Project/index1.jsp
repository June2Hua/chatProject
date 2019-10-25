<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>广州美食</title>
</head>
<body>
	index12345678888
	<%
		out.print("庄锦华");
	%>
	<br>
	<%
		out.print("庄锦华");
	%>
	<a href="http://www.baidu.com">进入百度</a>
	<h1>
		标题1
	</h1>
	<p>
		内容111
	</p>
	<br>
	<%!
		public String name="庄锦华";
		public int age=8080;
		public static double port=6379;
		Date date=new Date();
		
	%>
	<%="Tomcat \n\r"+age %>
	<%
		out.print(name+port+age);
	%>
	<%=name %>
	<h2>
	 表示层表现层表述层
	</h2>
	<%
		out.print("业务逻辑层<br/><br/><br/><br/><br/><br/>");
		out.print("<font color='red'>持久化层</font>");//注释
	%>
	<!-- thisis html comment -->
	<%=date.getDate() %>
	<%=date.getDay() %>
	<%=date.getHours() %> 
	<%=date.getMonth() %>
	<%=date.getYear() %>
</body>
</html>