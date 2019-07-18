package com.tyss.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.emp.bean.UserBean;

@Controller
@RequestMapping("/forms")
public class FormController {
      
	 // display the form
	 @GetMapping("/getForm")
	 public String getForm() {
		 return "myform";
	 }
	 
	 // recive the form 
	 @PostMapping("/formSubmit")
	 public String submitForm(HttpServletRequest req) {
		 
		 int id=Integer.parseInt(req.getParameter("userId"));
		 String password =req.getParameter("password");
		 
		 
		 req.setAttribute("userId", id);
		 req.setAttribute("password",password );
		 
		 return "formDataDisplay";
		 
	 }// End of submitForm
	 
	 
	 @PostMapping("/formSubmit2")
	 public String submitFrom2(int userId,String password,ModelMap modelMap ) {   // name should be same provide in jsp
		  //modelmap work same as setAtrribute
		 
		 modelMap.addAttribute("userId", userId);
		 modelMap.addAttribute("password", password);
		 return "formDataDisplay";
	 }
	 
	 @PostMapping("/formSubmit3")  
	 public String submitForm3(UserBean userBean,ModelMap modelMap) {
		 
		 modelMap.addAttribute("userBean", userBean);
		 
		 return "formDataDisplay";
	 }
	 
	 
	 @PostMapping("/formSubmit4")
	 public String submitForm4(@RequestParam(name="userId") int uid,
			                   @RequestParam(name="password") String pass,ModelMap modelMap) {
		 
		 modelMap.addAttribute("userId", uid);
		 modelMap.addAttribute("password", pass);
		 
		 return "formDataDisplay";
	 }
	 
	 
	 @PostMapping("/formSubmit5")
	 public String submitForm5(@RequestParam(name="userId") int uid,
			                   @RequestParam(name="password") String pass,ModelMap modelMap) {
		 
		 modelMap.addAttribute("userId", uid);
		 modelMap.addAttribute("password", pass);
		 
		 return "formDisplayDataEL";
	 }
	 
	 @PostMapping("/formSubmit6")  
	 public String submitForm6(UserBean userBean,ModelMap modelMap) {
		 
		 modelMap.addAttribute("userBean", userBean);
		 
		 return "formDataDisplayEL";
	 }
	 
	 
	 
}// End of Class
