/*
package com.apdarji;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Sum extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String str = req.getParameter("user_num");
		int num = Integer.parseInt(str);
		out.print("<h3>The sum of "+num+" is");
		int sum = 0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		out.print(" "+sum+"</h3>");
		out.close();
	}
}
*/