package com.tyss.hibernateassesment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateassesment.dto.CustomerBean;

public class CustomerDao {

	public static void main(String[] args) {

		CustomerBean bean = new CustomerBean();
		bean.setId(2);
		bean.setFirstName("Rajesh");
		bean.setLastName("Sharma");
		bean.setCity("Indore");
		bean.setContactNumber(99887745412L);
		bean.setAddress("Btm");
		bean.setCountry("India");
		bean.setState("MP");

		boolean result = save(bean);
		CustomerBean customerBean = read(1);
		update(1);
		delete(1);
		                        

	}

	public static boolean save(CustomerBean bean) {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();

		return true;
	}

	public static CustomerBean read(int id) {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		CustomerBean bean = session.get(CustomerBean.class, id);

		return bean;
	}

	public static boolean update(int id) {
		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		CustomerBean bean = session.get(CustomerBean.class, id);

		bean.setCity("bhopal");
		session.update(bean);
		transaction.commit();

		return true;

	}
	
	public static boolean delete(int id) {
		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		CustomerBean bean = session.get(CustomerBean.class, id);

		
		session.delete(bean);
		transaction.commit();

		return true;

	}

}
