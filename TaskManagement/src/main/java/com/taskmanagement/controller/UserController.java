package com.taskmanagement.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.dto.UserBean;
import com.taskmanagement.repo.UserRepository;
import com.taskmanagement.response.Response;

@RestController
@EntityScan(basePackages = "com.taskmanagement")
public class UserController {

	@Autowired
	UserRepository repository;

	//Login Controller For Task Management app
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE )
	public Response login(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletRequest req) {

		UserBean bean = repository.findByEmail(email).get();
		Response response = new Response();
		if (bean != null && bean.getPassword().equals(password)) {

			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login successfully");
			response.setUserBean(Arrays.asList(bean));
			req.getSession().setAttribute("bean", bean);

		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Login Failed");
		}
		return response;
	}//End of login()
	
	
	@GetMapping("/logout")
	public Response logout(HttpSession session) {
		Response response = new Response();
		session.invalidate();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Logout successfully");
		return response;
	}//End of logout()

	@GetMapping("/readCookie")
	public Response readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		Response response = new Response();
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("JSESSIONID:" + sessionId);
		return response;
	}//end of readcookie()

}//End of class
