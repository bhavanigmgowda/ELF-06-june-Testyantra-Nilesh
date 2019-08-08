package com.techchefs.emp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techchefs.emp.common.EmpConstant;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
@PropertySource(EmpConstant.PROP_FILENAME)
public class EmployeeController {

	@Autowired
	@Qualifier(EmpConstant.DB_INTERACTION_TYPE)
	EmployeeDAO dao;
	
	@GetMapping("/search")
	public String searchEmployeeById( int id,ModelMap map,@Value("${notFound}") String notFound) {
		ArrayList<EmployeeInfoBean> arrId = dao.getEmployeeIds(id);
		if(arrId !=null) {
			map.addAttribute("ArrayIds",arrId);
			return EmpConstant.VIEW_SEARCH_PAGE;
		}else {
			map.addAttribute("msg",notFound);
			return EmpConstant.VIEW_HOME_PAGE;
		}
	}
	
	@GetMapping("/fetch")
	public String getEmployeeDetails(int emp,ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(emp);
		map.addAttribute("bean", bean);
		return EmpConstant.VIEW_HOME_PAGE;
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor =new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
}
