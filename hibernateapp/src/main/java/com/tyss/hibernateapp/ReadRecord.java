package com.tyss.hibernateapp;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecord {

	public static void main(String[] args) {
		// load the config file
		Configuration cfg=new Configuration();
		//cfg.configure();
		//cfg.configure(new File("D:\\MyhibernateConfig.xml"));
		cfg.configure("MyhibernateConfig.xml`");
		
		//build SessionFactory
		SessionFactory factory=cfg.buildSessionFactory();
		
		 //open session
		Session session=factory.openSession();
		
		//Interact with db via session
		EmployeeOtherInfoBean empInfo=session.get(EmployeeOtherInfoBean.class,1);
		
		log.info(""+empInfo.isChallenged());
		 
		// close the session
		session.close();
	     
		// no need of transaction Object
		
		
	}
}
