package com.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletGreatingeg extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<B>");

		//Get the username
		String uname = req.getParameter("uname");

		// Get the current time
		       Date currentTime = new Date();
		       SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
		       String formattedTime = s.format(currentTime);
		       
		       // Generate the appropriate greeting on the basis of time
		       String greeting;
		       int hour = Integer.parseInt(formattedTime.substring(0, 2));
		       if (hour >= 0 && hour < 12) {
		           greeting = "Good morning";
		       } else if (hour >= 12 && hour < 16) {
		           greeting = "Good afternoon";
		       } else if (hour >= 17 && hour < 20) {
		           greeting = "Good evening";
		       } else {
		           greeting = "Good night";
		       }

		       // Display the greeting to the user
		     
		       out.println( greeting + ", " + uname + "!");
		  }
}

		
		
	


