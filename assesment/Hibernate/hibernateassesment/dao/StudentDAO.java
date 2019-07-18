package com.tyss.hibernateassesment.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateassesment.dto.StudentDTO;

import lombok.extern.java.Log;

@Log
public class StudentDAO {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		String qry = "select firstName,totalMarks from StudentDTO";

		Query query = session.createQuery(qry);

		List<StudentDTO> students = query.getResultList();

		for (StudentDTO studentDTO : students) {

			log.info("" + studentDTO.getFirstName());
			log.info("" + studentDTO.getTotalMarks());

		}

	}

}
