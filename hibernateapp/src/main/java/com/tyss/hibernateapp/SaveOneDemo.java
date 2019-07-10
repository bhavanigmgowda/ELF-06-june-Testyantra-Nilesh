package com.tyss.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.EmployeeAddressInfoBean;
import com.tyss.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveOneDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();  
		cfg.configure("hibernate.cfg.xml");
		//cfg.addAnnotatedClass(EmployeeAddressInfoBean.class);
		cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);
         
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession(); // crud operation
		
		/*
		 * EmployeeAddressInfoBean bean=new EmployeeAddressInfoBean(); bean.setId(1);
		 * bean.setAddress_Type("permanent"); bean.setAddress1("#312 ring Road");
		 * bean.setLandmark("LakeSide"); bean.setCity("Bhopal");
		 * bean.setCountry("India"); bean.setState("madhyaPradesh");
		 * bean.setPincode(452001);
		 */
		
		EmployeeOtherInfoBean bean =new EmployeeOtherInfoBean();
		bean.setId(1);
		bean.setIsmarried(false);
		bean.setBlood_grp("O+");
		bean.setChallenged(false);
		bean.setEmergency_contact_name("Radhe");
		bean.setAdhar(454584541204l);
		bean.setFather_name("Rajaram");
		
		
		
		
		
		

		Transaction transaction=session.beginTransaction();  
		session.saveOrUpdate(bean);
		transaction.commit();
		session.close();
}
}
