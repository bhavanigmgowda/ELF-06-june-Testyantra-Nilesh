package com.tyss.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	public List<EmployeeInfoBean> getAllEmployeeInfo();
	public EmployeeInfoBean getEmployeeInfo(String args);
	public EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}
