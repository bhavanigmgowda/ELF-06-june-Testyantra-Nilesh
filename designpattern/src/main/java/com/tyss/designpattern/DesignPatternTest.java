package com.tyss.designpattern;

import java.util.ArrayList;


import com.tyss.designpattern.bean.EmployeeInfoBean;
import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOFactory;
import com.tyss.designpattern.dao.EmployeeDAOHibernateImpl;
import com.tyss.designpattern.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

/**
 * designPattern main Class
 *
 */
@Log
public class DesignPatternTest {
	public static void main(String[] args) {
		EmployeeDAO dao=EmployeeDAOFactory.getIntance();
		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("1"));
		
		//EmployeeDAO daoone=EmployeeDAOFactory.getIntance();
		//daoone.getEmployeeInfo(1);
		
		
		
		/*
		 * log.info("==========");
		 * 
		 * ArrayList<EmployeeInfoBean> beans= dao.getAllEmployeeInfo();
		 * 
		 * for (EmployeeInfoBean employeeInfoBean : beans) {
		 * printInfo(employeeInfoBean); }
		 */
	}// end of method

	private static void printInfo(EmployeeInfoBean infoBean) {
		log.info("ID :" + infoBean.getId());
		log.info("NAME :" + infoBean.getName());
		log.info("AGE :" + infoBean.getAge());
		log.info("GENDER :" + infoBean.getGender());
		log.info("EMAIL :" + infoBean.getEmail());
		log.info("PHONE :" + infoBean.getPhone());
		log.info("SALARY :" + infoBean.getSalary());
		log.info("ACCOUNTNO :" + infoBean.getCcnt_no());
		log.info("DOB :" + infoBean.getDob());
		log.info("JOININGDATE :" + infoBean.getJoining_date());
		log.info("DEPARTMENT_ID :" + infoBean.getDept_ID());
		log.info("MANAGER_ID :" + infoBean.getManager_ID());

	}

}// end of class
