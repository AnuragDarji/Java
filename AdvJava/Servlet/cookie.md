### Cookies In Servlet: 

cookies.html
```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookies</title>
</head>
<body>
	<form action="http://localhost:8080/DemoServlet/cookie" method="post">
		Enter the value of cookie: <input type="text" name="txt_data" value=""><br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
```

Cookies.java
```java
package com.apdarji;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookies extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String txt_data = req.getParameter("txt_data");
		
		Cookie cookie = new Cookie("My_Cookie",txt_data);
		res.addCookie(cookie);
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h2>My Cookie has been set to: "+txt_data+"</h2>");
	}
}
```

web.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
	<servlet>
		<servlet-name>xyz</servlet-name>
		<servlet-class>com.apdarji.Cookies</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>xyz</servlet-name>
		<url-pattern>/cookie</url-pattern>
	</servlet-mapping>	
</web-app>
```

Output:
