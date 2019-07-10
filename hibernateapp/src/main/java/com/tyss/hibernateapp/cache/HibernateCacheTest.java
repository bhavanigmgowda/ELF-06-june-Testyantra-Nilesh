package com.tyss.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {

	public static void main(String[] args) {

		log.info("First time " + getEmployeeInfoBean(3));
		log.info("Second Time =" + getEmployeeInfoBean(3));
		log.info("Third Time =" + getEmployeeInfoBean(3));
	}

	private static EmployeeInfoBean getEmployeeInfoBean(int id)
	{
	  EmployeeInfoBean bean;
		
		try(Session session=HibernateUtil.getSession();)	                                      
		{
			
			bean=session.get(EmployeeInfoBean.class, id);
			log.info(""+bean.toString());
			return bean;
		}
	
	
	}

}
