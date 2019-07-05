package com.tyss.designpattern.dao;

import java.util.ArrayList;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	public EmployeeInfoBean getEmployeeInfo(String args);
	public EmployeeInfoBean getEmployeeInfo(int id);
}
