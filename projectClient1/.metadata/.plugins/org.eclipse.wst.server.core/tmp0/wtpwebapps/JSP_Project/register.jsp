<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<form action="show.jsp" method="post">
	姓名：<input type="text" name="name" ><br/>
	学号：<input type="text" name="id"><br/>
	选择学科：<br/>
	<input type="checkbox"  name="subjects" value="高等数学">高等数学
	<input type="checkbox"  name="subjects" value="线性代数">线性代数
	<input type="checkbox"  name="subjects" value="概率论与数理统计">概率论与数理统计
	<br/>
	<input type="submit" value="sure">
	</form>
</body>
</html>