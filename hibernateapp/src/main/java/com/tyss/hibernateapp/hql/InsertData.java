package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertData {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String qry = "insert into EmpInfoBean (eid,name,email) select id,name,email from EmployeeInfoBean where id=101";
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(qry);
			int result = query.executeUpdate();
			log.info(" =" + result);
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			log.info("" + e);

		}
		finally {
			session.close();
		}

	}
}
