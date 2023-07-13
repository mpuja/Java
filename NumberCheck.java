package com.servleteg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NumberCheck extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = Integer.parseInt(req.getParameter("num3"));
		PrintWriter out = res.getWriter();
		if(num1 > num2 && num1 > num3)
		out.print("The greater number is" + num1);
		else if(num2 > num1 && num2 > num3)
		out.print("The greater number is" + num2);
		else
		out.print("The greater number is" + num3);

		}
}

		


