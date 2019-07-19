package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
 
	
	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		        HttpSession session=req.getSession(false);
		        
		         if(session!=null) {
		        	 session.invalidate();  // inbuild clear session method
		         }
		         
		         PrintWriter out =resp.getWriter();
		         resp.setContentType("text/html");
		         out.print("<H3><span style=text-align: center;\\\"color:green\\\">Thank you for visiting!!!</span></H3>\"");
		         out.print("<br><br>");
		         RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
		         dispatcher.include(req, resp);
	}
}
