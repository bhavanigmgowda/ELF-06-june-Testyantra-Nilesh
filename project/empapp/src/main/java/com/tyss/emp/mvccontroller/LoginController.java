package com.tyss.emp.mvccontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.common.EmpConstant;
import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeAddressInfo;
import com.tyss.emp.dto.EmployeeEducationInfo;
import com.tyss.emp.dto.EmployeeExperienceInfo;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;

@Controller
@RequestMapping("/employee")
@PropertySource(EmpConstant.PROP_FILENAME)
public class LoginController {

	// binder Date
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	// get Login Page
	@GetMapping("/getform")
	public String getForm() {
		return EmpConstant.VIEW_LOGIN_PAGE;
	}

	// Authenticate
	@PostMapping("/login")
	public String getHome(String id, String password, ModelMap map, HttpServletRequest req) {

		EmployeeDAO dao = new EmployeeDAO();
		EmployeeInfoBean bean = dao.validateUser(id, password);

		if (bean != null && bean.getPassword().equals(password)) {

			HttpSession ses = req.getSession(true);
			ses.setAttribute("infoBean", bean);
			return "home2";

		} else {
			return "login";
		}

	}

	// create employee Page

	@GetMapping("/create")
	public String getRegistrationForm() {
		return "createAccount";
	}

	// save bean

	@PostMapping("/registration")
	public String saveEmployeeInfo(EmployeeInfoBean bean,int mgrId, ModelMap map) {
		EmployeeDAO dao = new EmployeeDAO();
	
			 
			   EmployeeInfoBean managerBean=dao.getEmployee(mgrId);
			      bean.setManagerId(managerBean);
		   
		 
		
		  

		List<EmployeeEducationInfo> eduBean = bean.getEducationalInfoBeans();

		// set id for education
		for (EmployeeEducationInfo employeeEducationInfo : eduBean) {
			employeeEducationInfo.getEducationInfoPKBean().setInfoBean(bean);
		}
		// set id for Address
		List<EmployeeAddressInfo> addressInfos = bean.getAddressInfoBean();
		for (EmployeeAddressInfo employeeAddressInfo : addressInfos) {
			employeeAddressInfo.getAddressPkBean().setInfoBean(bean);
		}
		// set id for Experience
		List<EmployeeExperienceInfo> experienceInfos = bean.getExpInfoBean();
		for (EmployeeExperienceInfo employeeExperienceInfo : experienceInfos) {
			employeeExperienceInfo.getEmployeeExperiencePKBean().setInfoBean(bean);
		}

		EmployeeOtherInfoBean otherInfoBean = bean.getOtherInfo();
		otherInfoBean.setInfoBean(bean);

		boolean result = dao.CreateEmployeeinfo(bean);
		if (result) {

			map.addAttribute("msg", "Employee Added Successfully");
		} else {
			map.addAttribute("msg", "Registration failed");
		}

		return "login";
	}
	
	@GetMapping("/logout")
	public String logoutFun(HttpSession session,ModelMap map) {
		if(session!=null) {
		session.invalidate();	
		}
		map.addAttribute("msg","logout Sucessfully");
		return "login";
	}
	

	
   // for update
	
	 @GetMapping("/updateEmployee")
	 public String getUpdate() {
		 
		  return "updateEmployee";
	 }
	 
	 @PostMapping("/updateEmployee")
	  public String updateEmployee(EmployeeInfoBean bean,int mgrId ) {
		  EmployeeDAO dao = new EmployeeDAO();
		   EmployeeInfoBean managerBean=dao.getEmployee(mgrId);
		      bean.setManagerId(managerBean);
		      
		      dao.updateEmployeeinfo(bean);
		      
		      return "home";
		       
	 }
	 
	 
	
	
	
	
	
}
