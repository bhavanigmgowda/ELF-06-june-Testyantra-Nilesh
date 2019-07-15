package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.beans.EmployeeInfoBean;
import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns = "/search",
		       initParams= {
	                       @WebInitParam(name="actress",value="basanti")	    		   
                }
		)

public class EmployeeSearchServlet   extends HttpServlet{
	@Override  
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		String actresName=config.getInitParameter("actress");
		
	    	
		String idValue=req.getParameter("id");
		
		//interact with db 
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
		
		//send the response to browser
		PrintWriter out=resp.getWriter();
		
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:red\">Emplpoyee Not Fount!!!</span></H1>");
			out.print("<BR><br>");
			out.print("</BODY>");
			out.print("</HTML>");
		}else {
			
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style=\"color:Blue\">Employee Found...</span></H1>");
			out.print("<br>");
			out.print("<br>Id :" + bean.getId());
			out.print("<br>name :" + bean.getName());
			out.print("<br>phone :" + bean.getPhone());
			out.print("<br>email:" + bean.getEmail());
			out.print("<br>gender:" + bean.getGender());
			out.print("<br>Designation :" + bean.getDesignation());
			out.print("<br>Salary :" + bean.getSalary());
			out.print("<br>AccountNumber :" + bean.getAccountNumber());
			out.print("<br>DepartmentId :" + bean.getDepartmentId());
			out.print("<br>ManagerId :" + bean.getManagerId());
			out.print("<br>movie name :" +movieName +"<br> actor "+actorName );
			out.print("<br>" +"actress"+actresName );
			out.print("</BODY>");
			out.print("</HTML>");
			
		}
		
	}
	

}
