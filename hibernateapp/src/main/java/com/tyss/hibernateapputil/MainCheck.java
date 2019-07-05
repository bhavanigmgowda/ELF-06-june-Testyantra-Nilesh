package com.tyss.hibernateapputil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

public class MainCheck {
  public static void main(String[] args) {
	
	  SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	  Session session= sessionfactory.openSession();
	  
	  EmployeeOtherInfoBean bean =session.get(EmployeeOtherInfoBean.class,1);
	  
	  Transaction transaction=session.beginTransaction();
	     
		bean.setBlood_grp("B+");
	    
		session.saveOrUpdate(bean);
		
		transaction.commit();
		session.close();
	  
	  
	 
	 
}
}
