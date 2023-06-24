<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL tag library</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/city_master" user="root" password=""/>
	
	<sql:query var="rs" dataSource="${db}">select * from city</sql:query>
	
	<c:forEach items="${rs.rows }" var="city">
		<br> <c:out value="${city.id}"></c:out> : <c:out value="${city.city_code}"></c:out> : <c:out value="${city.city_name}"></c:out> : <c:out value="${city.city_state}"></c:out>
	</c:forEach>
</body>
</html>