package com.techchefs.emp.dto;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateImpl {
	
	private Configuration config = new Configuration();
	private SessionFactory factory = config
									.configure()
									.buildSessionFactory();
			
	public void createEmployee(EmployeeInfoBean infoBean,
			EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean,
			List<EmployeeEducationInfoBean> employeeEducationInfoBeans,
			List<EmployeeExperianceInfoBean> employeeExperianceInfoBeans) {
		
		Session ses = factory.openSession();
		Transaction txn  = ses.beginTransaction();
		ses.save(infoBean);
		ses.save(otherInfoBean);
		//ses.save(addressInfoBean);
		
		
		//address
		for(EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			ses.save(employeeAddressInfoBean);
		}
		
		//education
		for(EmployeeEducationInfoBean educationInfoBean :employeeEducationInfoBeans) {
			ses.save(educationInfoBean);
		}
		
		//Experiance
		for(EmployeeExperianceInfoBean employeeExperianceInfoBean:employeeExperianceInfoBeans) {
			ses.save(employeeExperianceInfoBean);
		}
		txn.commit();
		ses.close();
	}
	
	public void createEmployee(EmployeeInfoBean infoBean) {
		Session ses = factory.openSession();
		Transaction txn  = ses.beginTransaction();
		ses.save(infoBean);
		txn.commit();
		ses.close();
	}
	
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session ses= factory.openSession();
		EmployeeInfoBean bean = ses.get(EmployeeInfoBean.class,id);
		ses.close();
		return bean;
	}

}
