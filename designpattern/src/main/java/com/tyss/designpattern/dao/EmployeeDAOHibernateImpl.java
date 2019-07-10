package com.tyss.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tyss.designpattern.bean.EmployeeInfoBean;
import com.tyss.designpattern.hibernateutil.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
	    return query.list();

	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String args) {
		return getEmployeeInfo(Integer.parseInt(args));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;

	}

	// save and update method
	private boolean saveorUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveorUpdate(bean); // calling saveorUpdate()
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveorUpdate(bean); // calling saveorUpdate()
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		Session session = HibernateUtil.openSession();
		session.delete(id, EmployeeInfoBean.class);

		return true;
	}

}// End of class
