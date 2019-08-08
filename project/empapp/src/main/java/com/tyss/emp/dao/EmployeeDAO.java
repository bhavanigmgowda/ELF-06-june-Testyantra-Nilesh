package com.tyss.emp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.util.HibernateUtil;

public class EmployeeDAO {

	public boolean CreateEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;

		try (Session session = com.tyss.emp.util.HibernateUtil.openSession();) {
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			if (txn != null) {
				txn.rollback();
			}

			return false;
		}
	}

	public EmployeeInfoBean validateUser(String Empid, String password) {

		int id=Integer.parseInt(Empid);
		
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class,id);

		if (bean != null && bean.getPassword().equals(password)) {
			return bean;
		}else {
			return null;
		}

	}
	
	public List<EmployeeInfoBean> searchEmployee(String Empid) {
		//int id=Integer.parseInt(Empid);
		
		Session session = HibernateUtil.openSession();
		String qry="from EmployeeInfoBean WHERE id like '"+Empid+"%'";
		
		   Query q = session.createQuery(qry);
		       return q.list();
	 
	}

}