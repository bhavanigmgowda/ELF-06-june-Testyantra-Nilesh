package com.tyss.hibernateassesment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateassesment.dto.CustomerBean;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	  private HibernateUtil() {};
	  
	  private static SessionFactory getConfigration() {
		  Configuration configuration=new Configuration().configure().addAnnotatedClass(CustomerBean.class);
          return configuration.buildSessionFactory();
          
          
	  }
	  
	   public static SessionFactory  getSessionfactory() {
		    
		   if(sessionFactory==null) {
			   return getConfigration();
		   }
		   else {
			   	return null;
		   }
		   
	   }

}
