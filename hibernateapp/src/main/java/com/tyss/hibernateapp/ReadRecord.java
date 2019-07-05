package com.tyss.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		EmployeeOtherInfoBean empInfo=session.get(EmployeeOtherInfoBean.class,1);
		
		log.info(""+empInfo.isChallenged());
		
	     
		// no need of transaction Object
		
		
	}
}
