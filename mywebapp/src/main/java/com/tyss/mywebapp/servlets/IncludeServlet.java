package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeServlet
 */
@WebServlet("/include")
public class IncludeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher=null;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("11111111111111111111111");
	    out.println("<br>");
	    
	    out.println("222222222222222222222222");
	    out.println("<br>");
	    
	    dispatcher=request.getRequestDispatcher("currentDate?fname=nilesh&lname=gupta");
	    dispatcher.include(request, response);
	    out.println("<br>");
	    
	    
	    out.println("33333333333333333333333");
	    out.println("<br>");
	    
	    dispatcher=request.getRequestDispatcher("search?id=2");
	    dispatcher.include(request, response);
	    out.println("<br>");
	    
	    out.println("44444444444444444444444444");
	    
	    
		
	}

}
