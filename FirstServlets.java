package com.cookie;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirstServlets extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			String n=request.getParameter("Username");
			out.print("welcome"+ n);
			
			Cookie ck= new Cookie("Username",n);
			response.addCookie(ck);
			
		
			out.print("<form action='servlet2' method ='post'>");
			out.print("<input type='submit'value='go'>");
			out.print("</form>");
			
			out.close();
		
		}
	}

	
