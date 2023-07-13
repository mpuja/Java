package com.hello;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServleteg extends HttpServlet{
	    public void doGet(HttpServletRequest req, HttpServletResponse res)
	            throws  IOException {
	        res.setContentType("text/html");
	        res.getWriter().println("<h1>Hello Java Web</h1>");
	    }
	}


