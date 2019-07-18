package com.tyss.hibernateassesment.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDAO {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		String qry = "insert into firstName,lastName,city from TestDTO, select firstName,lastName,city from CustomerBean";
		Query query = session.createQuery(qry);

		query.executeUpdate();

	}
}
