package com.tyss.hibernateapp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecord {
  public static void main(String[] args) {
	
	  Configuration cfg=new Configuration();
	  cfg.configure("hibernate.cfg.xml");
	  
	  SessionFactory factory=cfg.buildSessionFactory();
	  Session session=factory.openSession();
	  
	 
	  
		EmployeeOtherInfoBean bean =session.get(EmployeeOtherInfoBean.class,1);
	     
		bean.setBlood_grp("AB+");
	 
	  
	  Transaction transaction=session.beginTransaction();
	  session.update(bean);
	  transaction.commit();
	  session.close();
	  
	  
	  
	  
	  
	  
}
}
