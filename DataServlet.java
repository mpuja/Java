package com.session;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DataServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession hs = req.getSession(true);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<B>");

		Date date = (Date) hs.getAttribute("date");
		String username =(String) hs.getAttribute("username");

		if(date != null && username != null)
		{
		out.print("Your previous Username : "+ hs.getAttribute("username"));
		out.print("<br>");
		out.print("Last access : " + date + "<br>");
		}
		username = req.getParameter("username");
		hs.setAttribute("username", username);

		date = new Date();
		hs.setAttribute("username", username);

		out.println("Current date : " + date);

		}
		}

