package com.tyss.hibernateapp.hqlcreateria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllRecords {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);

		Criterion cr = Restrictions.gt("salary", 22500.00);

		criteria.add(cr);

		List<EmployeeInfoBean> employeeInfoBean = (List<EmployeeInfoBean>) criteria.list();

		for (EmployeeInfoBean employeeInfo : employeeInfoBean) {
//			  log.info("Id " + employeeInfo.getId());
//				log.info("Name " + employeeInfo.getName());
//				log.info("Age " + employeeInfo.getAge());
//				log.info("Designation " + employeeInfo.getDesignation());
//				log.info("Email" + employeeInfo.getEmail());
//				log.info("Gender " + employeeInfo.getGender());
//				log.info("Phone " + employeeInfo.getPhone());
			log.info("Salary " + employeeInfo.getSalary());
//				log.info("Dept_ID " + employeeInfo.getDept_ID());
//				log.info("Manager_ID " + employeeInfo.getManager_ID());
//				log.info("Dob" + employeeInfo.getDob());
//				log.info("Joining_date " + employeeInfo.getJoining_date());

		}

		/*
		 * for (EmployeeInfoBean employeeInfoBean : emp) {
		 * 
		 * log.info("Id " + employeeInfoBean.getId()); log.info("Name " +
		 * employeeInfoBean.getName()); log.info("Age " + employeeInfoBean.getAge());
		 * log.info("Designation " + employeeInfoBean.getDesignation());
		 * log.info("Email" + employeeInfoBean.getEmail()); log.info("Gender " +
		 * employeeInfoBean.getGender()); log.info("Phone " +
		 * employeeInfoBean.getPhone()); log.info("Salary " +
		 * employeeInfoBean.getSalary()); log.info("Dept_ID " +
		 * employeeInfoBean.getDept_ID()); log.info("Manager_ID " +
		 * employeeInfoBean.getManager_ID()); log.info("Dob" +
		 * employeeInfoBean.getDob()); log.info("Joining_date " +
		 * employeeInfoBean.getJoining_date());
		 * 
		 * }
		 */

	}
}
