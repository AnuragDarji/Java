<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
    
<!--	Declaration
	Directive
 	Scriplet
 	Expression -->
 	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%!
		int coef = 3;
	%>
	<h1>Hello World!</h1>
	<%
		out.println(7+5);
	%>
	<br/>
	My Fav Number is : <%= coef %>
</body>
</html>