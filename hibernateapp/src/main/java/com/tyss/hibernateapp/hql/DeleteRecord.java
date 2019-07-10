package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String hql = "Delete from EmployeeInfoBean where id=32 ";

		Query query = session.createQuery(hql);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Delete =" + result);

			transaction.commit();
		} catch (Exception e) {
			log.severe("" + e);
			transaction.rollback();
		} finally {
			session.close();
		}

	}// end of main
}