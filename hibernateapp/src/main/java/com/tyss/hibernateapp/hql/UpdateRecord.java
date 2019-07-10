package com.tyss.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;
/**
 * 
 * @author Administrator
 *  update table using hibernate(HQL Query)
 */
@Log
public class UpdateRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		//String hql = "update from EmployeeInfoBean set name=:ename where id=:eid ";
		String hql = "update from EmployeeInfoBean set name='+args[0]+' where id=" +Integer.parseInt(args[1])+" ";

		Query query = session.createQuery(hql);
		        //query.setParameter("ename",args[0]);
		      //  query.setParameter("eid",Integer.parseInt(args[1]));
		        
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("" + result);

			transaction.commit();
		} catch (Exception e) {
			log.severe("" + e);
			transaction.rollback();
		} finally {
			session.close();
		}

	}// end of main
}// End of class
