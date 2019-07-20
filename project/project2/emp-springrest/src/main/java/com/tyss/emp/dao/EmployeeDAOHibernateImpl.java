package com.tyss.emp.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.emp.dto.EmployeeAddressInfo;
import com.tyss.emp.dto.EmployeeEducationInfo;
import com.tyss.emp.dto.EmployeeExperienceInfo;
import com.tyss.emp.dto.EmployeeInfoBean;
import com.tyss.emp.dto.EmployeeOtherInfoBean;
import com.tyss.emp.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	private boolean saveOrUpdate(EmployeeInfoBean bean) {

		List<EmployeeEducationInfo> eduBean = bean.getEducationalInfoBeans();

		// set id for education
		for (EmployeeEducationInfo employeeEducationInfo : eduBean) {
			employeeEducationInfo.getEducationInfoPKBean().setInfoBean(bean);
		}
		// set id for Address
		List<EmployeeAddressInfo> addressInfos = bean.getAddressInfoBean();
		for (EmployeeAddressInfo employeeAddressInfo : addressInfos) {
			employeeAddressInfo.getAddressPkBean().setInfoBean(bean);
		}
		// set id for Experience
		List<EmployeeExperienceInfo> experienceInfos = bean.getExpInfoBean();
		for (EmployeeExperienceInfo employeeExperienceInfo : experienceInfos) {
			employeeExperienceInfo.getEmployeeExperiencePKBean().setInfoBean(bean);
		}
		// set Id for otherinfo
		EmployeeOtherInfoBean otherInfoBean = bean.getOtherInfo();
		otherInfoBean.setInfoBean(bean);

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

	@Override
	public boolean createEmployeeinfo(EmployeeInfoBean bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeinfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);

	}

	@Override
	public boolean deleteEmployeeinfo(int id) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {

			txn = session.beginTransaction();
			EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
			session.delete(bean);
			txn.commit();
			session.close();
			return true;
		} catch (Exception e) {
			txn.rollback();
			return false;
		}
	}

	@Override
	public EmployeeInfoBean getEmployee(int Id) {

		Session session = HibernateUtil.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, Id);
		session.close();
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployee(String Id) {

		return getEmployee(Integer.parseInt(Id));
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployee() {
		Session session = HibernateUtil.openSession();
		Query qry = session.createQuery("from EmployeeInfoBean");

		return qry.getResultList();
	}

}
