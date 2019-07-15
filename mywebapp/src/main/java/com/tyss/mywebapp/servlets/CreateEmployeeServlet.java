package com.tyss.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyss.mywebapp.beans.EmployeeInfoBean;
import com.tyss.mywebapp.dao.EmployeeDAO;
import com.tyss.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/insert")
public class CreateEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		SimpleDateFormat date=new SimpleDateFormat("yyyy/mm/dd");
		
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
	    bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setName(req.getParameter("name"));
	    bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setGender(req.getParameter("gender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setPhone(Long.parseLong(req.getParameter("phone")));
		bean.setEmail(req.getParameter("email"));
		bean.setDesignation(req.getParameter("designation"));
		bean.setManagerId(Integer.parseInt(req.getParameter("managerId")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountNumber")));
		
		
		try {
			bean.setDob(date.parse(req.getParameter("dob")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		
		
		bean.setDepartmentId(Integer.parseInt(req.getParameter("departmentId")));
	
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean result=dao.CreateEmployeeinfo(bean);
		PrintWriter out=resp.getWriter();
		 if(result==true)
		 {
				out.print("<H1><span style=\"color:Green\">Employee Data is Saved!!!</span></H1>");
		 }
		 else
		 {
				out.print("<H1><span style=\"color:red\">Employee Data is not Saved!!!</span></H1>");	 
		 }
		
		
	                    
		
	}
	

}
