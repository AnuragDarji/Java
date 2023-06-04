<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mySql Demo</title>
</head>
<body bgcolor='FFDCBB'>
	<%
		String url="jdbc:mysql://localhost:3306/city_master";
		String username="root";
		String password="";
		String sql="select * from student where rollno=101";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		rs.next();
	%>
	Rollno: <%= rs.getString(1) %> <br>
	Name: <%= rs.getString(2) %> <br>
	Marks: <%= rs.getString(3) %> 
</body>
</html>