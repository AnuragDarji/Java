<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Function tag library</title>
</head>
<body>
	<c:set var="str1" value="I LOVE INDIA"/>
	<c:set var="str2" value="${fn:toLowerCase(str1) }"/>
	<p><b>Original: </b>${str1 }</p>
	<p><b>Conversion: </b>${str2}</p>
</body>
</html>