package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;
@WebServlet("/loginPage")
public class LoginServlet extends HttpServlet {

     	     @Override
     	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     	    	
                     PrintWriter out =resp.getWriter();
                     HttpSession session =req.getSession();
                     resp.setContentType("text/html");
                     
                    Cookie dummyCookie=new Cookie("dummyCookie","checkCookieEnable");
          		    resp.addCookie(dummyCookie);
                     
                     if(session==null)
                     {
                    	 RequestDispatcher dispatcher=req.getRequestDispatcher("index.html");
                 		
                 		
                     }
                     else {
                    	 out.print("<H3><span style=text-align: center;\"color:red\">Invalid Username OR password!!!</span></H3>");	 
                    	 RequestDispatcher dispatcher=req.getRequestDispatcher("home.html");
                    	 dispatcher.forward(req, resp);
                     }
   
                     
     	    	  
     			
     	    	 
     	    }
	   
}// end of class 
