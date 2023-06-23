package com.apdarji;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Prime extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String str = req.getParameter("user_num");
		int n = Integer.parseInt(str);
		int i,m=0,flag=0;
		m=n/2;
		if(n==0|n==1) {
			out.print(n+" is not prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					out.print(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				out.print(n+" is prime number");
			}
			out.close();
		}
	}
}
