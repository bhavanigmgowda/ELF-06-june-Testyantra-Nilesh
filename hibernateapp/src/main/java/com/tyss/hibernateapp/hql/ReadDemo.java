package com.tyss.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		// String hql="from EmployeeInfoBean"; // select all hql Query
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);

		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		List<String> names = query.list();

		for (String name : names) {
			log.info("" + name);
		}

		/*
		 * for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
		 * log.info("Id "+employeeInfoBean.getId());
		 * log.info("Name "+employeeInfoBean.getName());
		 * log.info("Age "+employeeInfoBean.getAge());
		 * log.info("Designation "+employeeInfoBean.getDesignation());
		 * log.info("Email"+employeeInfoBean.getEmail());
		 * log.info("Gender "+employeeInfoBean.getGender());
		 * log.info("Phone "+employeeInfoBean.getPhone());
		 * log.info("Salary "+employeeInfoBean.getSalary());
		 * log.info("Dept_ID "+employeeInfoBean.getDept_ID());
		 * log.info("Manager_ID "+employeeInfoBean.getManager_ID());
		 * log.info("Dob"+employeeInfoBean.getDob());
		 * log.info("Joining_date "+employeeInfoBean.getJoining_date());
		 * 
		 * }
		 */

	}
}
