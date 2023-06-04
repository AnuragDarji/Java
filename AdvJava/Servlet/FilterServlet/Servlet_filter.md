### *Servlet_Filter*

#### *Code :*

##### home.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet_Filter</title>
</head>
<body>
	
	<form action="addAlien">
		<input type="text" name="aid"> <br/>
		<input type="text" name="aname"> <br/>
		<input type="submit" > <br/>
	</form>
	
</body>
</html>
```
##### MyServlet.java
```java
package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		
		out.println("Welcome "+aname);
	}

}
```
##### IdFilter.java
```java
package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class IdFilter
 * @param <HttpServletRequest>
 */
@WebFilter("/addAlien")
public class IdFilter<HttpServletRequest> extends HttpFilter implements Filter {
       
   	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		if(aid>1)
			chain.doFilter(request, response);
		else
			out.println("Invalid Input");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
```

#### *Output :*

![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/4c636895-b29c-4c66-80b8-52291d437f6b)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/8e4ab1f9-b6d9-4391-b493-32da0549a307)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/6901ee90-2963-4c63-8ba0-4ef1f4786447)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/56d1c005-1ec1-46f6-8f8c-4a0f55967817)
