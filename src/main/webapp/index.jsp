<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>test</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h2>Hello World!</h2>
<form action="./user/login.do" method="post">
	userName:<input type="text" name='userName' value='${user.userName}'><br>
	password:<input type="text" name='password' value='${user.password}' ><br>
	<input type="submit" value='login' ><font color='red' >${errorMsg}</font>
</form>
</body>
</html>
