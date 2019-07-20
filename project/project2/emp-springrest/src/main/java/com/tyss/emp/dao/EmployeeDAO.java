package com.tyss.emp.dao;

import java.util.List;

import com.tyss.emp.dto.EmployeeInfoBean;

public interface EmployeeDAO {
    
	boolean createEmployeeinfo(EmployeeInfoBean bean);
	
	boolean updateEmployeeinfo(EmployeeInfoBean bean);
	
	boolean deleteEmployeeinfo(int id);
	
	
	EmployeeInfoBean getEmployee(int Id);
	EmployeeInfoBean getEmployee(String Id);
	
	List<EmployeeInfoBean> getAllEmployee();
	
}
