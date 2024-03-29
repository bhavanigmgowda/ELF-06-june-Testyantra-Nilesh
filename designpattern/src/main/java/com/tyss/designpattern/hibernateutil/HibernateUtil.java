package com.tyss.designpattern.hibernateutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private HibernateUtil() {}
	
	
	private static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class)
				   .buildSessionFactory();


	
	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;

	}
	
	public static Session openSession()
	{
		return getSessionFactory().openSession();
	}
	
	
}// End OF Class