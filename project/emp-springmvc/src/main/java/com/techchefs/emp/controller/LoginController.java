package com.techchefs.emp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techchefs.emp.common.EmpConstant;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;
import com.techchefs.emp.dao.EmployeeDAOHibernateImpl;
import com.techchefs.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/login")
@PropertySource(EmpConstant.PROP_FILENAME)
public class LoginController {
	
	@Autowired
	@Qualifier(EmpConstant.DB_INTERACTION_TYPE)
	EmployeeDAO dao;
	
	
	@GetMapping("/loginPage")
	public String getForm() {
		return EmpConstant.VIEW_LOGIN_PAGE;
	}
	
	@GetMapping("/getRegistrationForm")
	public String getRegistrationForm() {
		return "registration";
	}
	
	
	@PostMapping("/authenticate")
	public String submitLoginForm(int id,String password,ModelMap map,HttpServletRequest req,@Value("${invalid}") String invalid,@Value("${dbInteraction}") String dbInteraction) {
		
		//EmployeeDAO dao= EmployeeDAOFactory.getEmployeeDAOInstance(dbInteraction);
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if(bean !=null && bean.getPassword().equals(password)) {
			HttpSession ses =req.getSession(true);
		
			ses.setAttribute("bean",bean);
		return EmpConstant.VIEW_HOME_PAGE;
		}
		else {
			req.setAttribute("msg", invalid);
			return "loginForm";
		}
	}
	
	
//	@GetMapping("/search")
//	public String searchEmployeeById( int id,ModelMap map) {
//		ArrayList<EmployeeInfoBean> arrId = dao.getEmployeeIds(id);
//		if(arrId !=null) {
//			map.addAttribute("ArrayIds",arrId);
//			return "searchEmployee";
//		}else {
//			map.addAttribute("msg","No employee Found");
//			return "home";
//		}
//	}
	
	
	@GetMapping("/fetch")
	public String getEmployeeDetails(int emp,ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(emp);
		map.addAttribute("bean", bean);
		return "home";
		
	}
	
	
	@GetMapping("/logout")
	public String logoutFun(HttpSession session,ModelMap map,@Value("${logoutMessage}") String logoutMessage) {
		if(session!=null) {
		session.invalidate();	
		}
		map.addAttribute("msg", logoutMessage);
		return EmpConstant.VIEW_LOGIN_PAGE;
	}
	
	
	
	@PostMapping("/registration")
	public String saveEmployeeInfo(EmployeeInfoBean bean) {
		EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		dao.createEmployeeInfo(bean);
		return "loginForm";
	
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor =new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
//	@GetMapping("/validate/{url}")
//	public String validateSessionGet(@PathVariable String url,HttpSession ses,ModelMap map /*@RequestParam String url*/,@Value("${msg}") String msg) {
//		if(ses.isNew())
//		{
//			map.addAttribute("msg", msg);
//			ses.invalidate();
//			return"loginForm";
//		}
//		//return url;
//		return "forward:/employee/"+url;
//		}
	
	
	
//	@GetMapping("/validate")
//	public String validateSessionGet1(HttpServletRequest req,ModelMap map ,@RequestParam String url) {
//		if(req.getSession(false)==null)
//		{
//			map.addAttribute("msg", "Please Login First");
//			return"loginForm";
//		}
//		return url;
//		}
//	
	
//	@PostMapping("/validate")
//	public String validateSessionPost(@PathVariable String url,HttpSession ses, ModelMap map,
//			/* @RequestParam String url, */@Value("${msg}") String msg) {
//		return validateSessionGet(url, ses, map, msg);
//	}
}
