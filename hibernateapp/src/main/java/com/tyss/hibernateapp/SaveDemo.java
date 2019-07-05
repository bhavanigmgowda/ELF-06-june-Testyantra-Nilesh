package com.tyss.hibernateapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

public class SaveDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
         
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession(); // crud operation
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(102);
		bean.setName("Mohit");
		bean.setAge(29);
		bean.setGender("Male");
		bean.setSalary(5145);
		bean.setPhone(9951421051l);
		bean.setEmail("sharmamohit@gmail,com");
		bean.setDesignation("salesman");
		bean.setCcnt_no(54545554L);
		bean.setJoining_date(new Date("2018/04/16"));
		bean.setDept_ID(3);
		bean.setManager_ID(4);
		bean.setDob(new Date("1995/10/16"));
		
		Transaction transaction=session.beginTransaction();  
	//	session.save(bean);
		session.saveOrUpdate(bean);
		
		transaction.commit();
		session.close();
		
          
	}
}
