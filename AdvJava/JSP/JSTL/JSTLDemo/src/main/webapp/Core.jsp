<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Core tag library</title>
</head>
<body>
	<form method="post" action="Core.jsp">
		Name: <input type="text" name="text1" value=""><br><br>
		<input type="submit" value="Enter"> 
	</form>
	<br>
	Name: <c:out value="${param.text1 }"/><br>
</body>
</html>