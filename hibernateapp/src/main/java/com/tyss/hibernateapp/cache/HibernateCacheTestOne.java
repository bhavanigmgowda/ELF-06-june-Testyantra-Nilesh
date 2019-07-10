package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTestOne {
   public static void main(String[] args) {
	   // load the config file
		Configuration configuration=new Configuration();
		configuration.configure("com/tyss/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		// build session factory
	
		SessionFactory factory=configuration.buildSessionFactory();
		
		// open session
		Session session=factory.openSession();
		
		// intract witn db via session
		
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class,3);
		log.info(""+bean.toString());
		
		EmployeeInfoBean beanOne=session.get(EmployeeInfoBean.class,3);
		log.info(""+beanOne.toString());
		
		EmployeeInfoBean beanTwo=session.get(EmployeeInfoBean.class,3);
		log.info(""+beanTwo.toString());
		

		// close the session
		session.close();
		
}
}
