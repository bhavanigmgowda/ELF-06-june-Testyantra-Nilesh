package com.tyss.emp.dao;

import java.util.List;

import com.tyss.emp.dto.EmployeeInfoBean;

public class Test {
   public static void main(String[] args) {
	 EmployeeDAO d=new EmployeeDAO();
	 
	 List<EmployeeInfoBean> eid=d.searchEmployee("2");
	 
	 for (EmployeeInfoBean id : eid) {
		System.out.println(id.getName());
	}
	  
	
	   
}
}
