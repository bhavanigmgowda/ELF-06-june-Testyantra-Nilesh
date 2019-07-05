package com.tyss.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String args) {
		return getEmployeeInfo(Integer.parseInt(args));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class,id);
		session.close();
		return bean;
		
	
	}

}
