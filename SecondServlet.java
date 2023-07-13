package com.cookie;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet{

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
				response.setContentType("text/html");
				PrintWriter out= response.getWriter();
				
				Cookie ck[]= request.getCookies();
				out.print("Hello"+ ck[0].getValue());
				
				//out.print("Getting Name from Cookie<br>");
				
			out.close();
		
			}
		}
	
		


