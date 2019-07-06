package com.tyss.designpattern;

import java.util.ArrayList;
import java.util.Date;

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
		//printInfo(dao.getEmployeeInfo(1));
		//printInfo(dao.getEmployeeInfo("1"));
		
		//EmployeeDAO daoone=EmployeeDAOFactory.getIntance();
	
		//printInfo(dao.getEmployeeInfo("1"));
		
		
		
		//save operation
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(103);
		bean.setName("Yash");
		bean.setAge(29);
		bean.setGender("Male");
		bean.setSalary(5145);
		bean.setPhone(9951421051l);
		bean.setEmail("Yash@gmail,com");
		bean.setDesignation("Developer");
		bean.setCcnt_no(54545554L);
		bean.setJoining_date(new Date("2019/05/18"));
		bean.setDept_ID(3);
		bean.setManager_ID(4);
		bean.setDob(new Date("1997/02/24"));
		
		
		
	//	log.info("Inserted the employee info ?"+ dao.createEmployeeInfo(bean));
		
		
		
		dao.deleteEmployeeInfo(105);
		
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
