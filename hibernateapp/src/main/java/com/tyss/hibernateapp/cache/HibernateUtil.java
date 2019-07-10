package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	 private static SessionFactory factory=null;
	private HibernateUtil() {

	}
	
	private static SessionFactory getSessionFactory()
	{ 
		 if(factory==null)
		 {
			    factory=new Configuration().
				configure("com/tyss/hibernateapp/cache/hibernate.cache.cfg.xml")
			   .addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
				
		 }
		
		return factory;
		
	}
	
	public static Session getSession()
	{
		
		return getSessionFactory().openSession();
	}
	
}
