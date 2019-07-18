package com.tyss.hibernateassesment.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateassesment.dto.StudentDTO;

import lombok.extern.java.Log;

@Log
public class StudentMaxMinDAO {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		String qry = "select min(totalMarks),max(totalMarks),avg(totalMarks),totalMarks from StudentDTO Order by totalMarks";

		Query query = session.createQuery(qry);

		List<Object> students = query.getResultList();

		for (int i = 0; i < students.size(); i++) {

			log.info("" + students.get(i));

		}

	}

}
