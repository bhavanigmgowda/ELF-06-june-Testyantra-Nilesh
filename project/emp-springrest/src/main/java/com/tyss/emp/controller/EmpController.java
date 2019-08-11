package com.tyss.emp.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyss.emp.common.EmpConstant;

@Controller
@RequestMapping("/employee")
@PropertySource(EmpConstant.PROP_FILENAME)
public class EmpController {
	
	
	public String deleteEmployee() {
		return null;
	}
	
	public String createEmployee() {
		return null;
	}
	
	public String getEmployee() {
		return null;
	}
	
	public String updateEmployee() {
		return null;
	}

	public String getAllEmployee() {
		return null;
	}  
}
