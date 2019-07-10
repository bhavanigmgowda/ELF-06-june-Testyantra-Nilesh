package com.tyss.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateProgramForAws {

	    public static void main(String[] args) {
		   Configuration configuration=new Configuration();
		   configuration.configure("com/tyss/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		   configuration.addAnnotatedClass(EmployeeInfoBean.class);
		   
		   SessionFactory factory=configuration.buildSessionFactory();
		   
		   Session session=factory.openSession();
		   
		   EmployeeInfoBean bean=session.get(EmployeeInfoBean.class,1);
		    
		   log.info("Employee Detail"+bean.toString());
		   
		   session.close();
		   
		   
		}
}
