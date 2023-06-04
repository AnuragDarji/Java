### *Servlet_Filter*

#### *Code :*

##### home.jsp
```jsp

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
```

#### *Output :*

![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/4c636895-b29c-4c66-80b8-52291d437f6b)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/8e4ab1f9-b6d9-4391-b493-32da0549a307)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/6901ee90-2963-4c63-8ba0-4ef1f4786447)
![App Screenshot](https://github.com/AnuragDarji/Java/assets/127482974/56d1c005-1ec1-46f6-8f8c-4a0f55967817)
