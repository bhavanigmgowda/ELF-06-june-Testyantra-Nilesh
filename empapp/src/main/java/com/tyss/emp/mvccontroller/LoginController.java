package com.tyss.emp.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class LoginController {
 
	 @GetMapping("/getform")
	 public String getForm() {
		 return "login";
	 }
	 
	 @PostMapping("/login")
	 public String getHome() {
		 
		 return "home";
	 }
	
	 
	 
	
}
