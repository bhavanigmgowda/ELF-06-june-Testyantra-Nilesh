package com.tyss.mywebapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     String Current=new Date().toString();
	     
	     String htmlresponse="<!DOCTYPE html>" + 
	     		"<html>" + 
	     		"<head>" + 
	     		"<meta charset=\"ISO-8859-1\">\r\n" + 
	     		"<title>Insert title here</title>\r\n" + 
	     		"</head>" + 
	     		"<body>" + 
	     		"      <h1>Current date and time</h1>\r\n" + 
	     		"      <span> "+Current + "</span>" + 
	     		"</body>" + 
	     		"</html>";
	     
	      resp.setContentType("text/html");
	      resp.setHeader("Refresh","1"); // auto refresh
          PrintWriter out=resp.getWriter();
          out.println(htmlresponse);
	
	}
	
	
	
}
