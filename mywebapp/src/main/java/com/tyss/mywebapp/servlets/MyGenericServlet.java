package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/generic")
public class MyGenericServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		    res.setContentType("text/html");
		    PrintWriter out=res.getWriter();
		    out.println("<html>");
		    out.println("<body>");
		    out.println("<h1>");
		    out.println("Welcome to the world of Servlet");
		    out.println("</h1>");
		    out.println("</body>");
		    out.println("</html>");
		    
	}
	
   
	
}// end of class
