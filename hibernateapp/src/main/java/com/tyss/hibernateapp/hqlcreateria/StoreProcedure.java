package com.tyss.hibernateapp.hqlcreateria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StoreProcedure {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		StoredProcedureQuery procedure = session.createStoredProcedureCall("Employee", EmployeeInfoBean.class);
		List<EmployeeInfoBean> bean = procedure.getResultList();

		for (EmployeeInfoBean employeeInfoBean : bean) {
			log.info("Id " + employeeInfoBean.getId());
			log.info("Name " + employeeInfoBean.getName());
			log.info("Age " + employeeInfoBean.getAge());
			log.info("Designation " + employeeInfoBean.getDesignation());
			log.info("Email" + employeeInfoBean.getEmail());
			log.info("Gender " + employeeInfoBean.getGender());
			log.info("Phone " + employeeInfoBean.getPhone());
			log.info("Salary " + employeeInfoBean.getSalary());
			log.info("Dept_ID " + employeeInfoBean.getDept_ID());
			log.info("Manager_ID " + employeeInfoBean.getManager_ID());
			log.info("Dob" + employeeInfoBean.getDob());
			log.info("Joining_date " + employeeInfoBean.getJoining_date());
		}

	}// end of method
}// end of class
