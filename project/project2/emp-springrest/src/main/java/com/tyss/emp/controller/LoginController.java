package com.tyss.emp.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.emp.common.EmployeeResponse;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dao.EmployeeDAOHibernateImpl;
import com.tyss.emp.dto.EmployeeInfoBean;

@RestController
public class LoginController {

	EmployeeDAO dao = new EmployeeDAOHibernateImpl();

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password,HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean = dao.getEmployee(id);
		if (bean != null && bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMsg("Succesfull");
			response.setDescription("Logged Sucessfull");
			response.setBean(Arrays.asList(bean));
			request.getSession().setAttribute("bean",bean);

		} else {
			response.setStatusCode(401);
			response.setMsg("Failure");
			response.setDescription("Invalid Credencials");

		}

		return response;

	}// End of login
	
	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	 public EmployeeResponse logout(HttpSession session) {
		 
		 EmployeeResponse response=new EmployeeResponse();
		    session.invalidate();
		    response.setStatusCode(201);
			response.setMsg("Succesfull");
			response.setDescription("Logout  Sucessfull");
			
			return response;
		 
	 }
	@GetMapping(value = "/readCookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		
		EmployeeResponse response=new EmployeeResponse();
		
		response.setStatusCode(201);
		response.setMsg("Succesfull");
		response.setDescription("SessionId"+sessionId);
		
		return response;
		
		
	}
	  	
	
	
	
}// End of Class
