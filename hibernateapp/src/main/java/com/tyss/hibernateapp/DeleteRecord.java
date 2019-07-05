package com.tyss.hibernateapp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;

public class DeleteRecord {

	
	 public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session=factory.openSession();
		 
		 EmployeeInfoBean empInfo=session.get(EmployeeInfoBean.class,5);
		 
		 Transaction transaction=session.beginTransaction();
		 session.delete(empInfo);
		 transaction.commit();
		 session.close();
		 
		 
	}
}
