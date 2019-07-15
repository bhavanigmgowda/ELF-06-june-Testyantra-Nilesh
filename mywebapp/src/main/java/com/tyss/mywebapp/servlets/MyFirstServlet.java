package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
/*
 * Servlet demo 
 */

@Log
public class MyFirstServlet extends HttpServlet {
	
	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		
		
		
		String httpMethod= req.getMethod();
		String protocol=req.getProtocol();
		String requestUrl= req.getRequestURL().toString();
		
		
		log.info("=========="+httpMethod);
		log.info("=========="+protocol);
		log.info("=========="+requestUrl);
		
		String currentDateTime=new Date().toString();
		//get query string info
		String fnamevalue=req.getParameter("fname");
		String lnamevalue=req.getParameter("lname");
		String htmlresponse="<!DOCTYPE html>"+
								"<html>"+
								"<head>"+
								"<meta charset=\"ISO-8859-1\">"+
								"<title>My first page</title>"+
								"</head>"+
								"<body>"+
								 "<h1>Current Date & Time is : <span style=\"color: blue\">"+currentDateTime+"</span></h1><br><br>"+
								"<h2>Name :"+fnamevalue +"  "+ lnamevalue+"</h2>"+
								 "<br>"+"movieName"+movieName+"<br>"+"actorName "+actorName+
								"</body>"+
								"</html>";
		//send the above  HTMl response to browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh","1");//auto refresh
		PrintWriter out=resp.getWriter();
		out.print(htmlresponse);
		
		
	}//end of doGet()
	
	
	
	
}//end of class
