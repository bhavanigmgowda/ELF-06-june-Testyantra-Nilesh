package com.tyss.hibernateapp.hqlcreateria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateapp.dto.EmployeeInfoBean;
import com.tyss.hibernateapputil.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetDetailProjection {
   
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		//Projections.property("id");
		Projection pro=Projections.property("name");
		Projection proOne=Projections.property("id");
		
		ProjectionList projectionList=Projections.projectionList();
		projectionList.add(pro);
		projectionList.add(proOne);
	
	   
		List<Object[]> obj=criteria.setProjection(projectionList).list();
		
//		 for (Object[] objects : obj) {
//			log.info(""+objects[0]);
//			log.info(""+objects[1]);
//		}
		 
		 for (int i = 0; i < obj.size(); i++) {
			log.info(""+obj.get(0));
			log.info(""+obj.get(1));
			
		}
		
	
		
		

		
	}
}
