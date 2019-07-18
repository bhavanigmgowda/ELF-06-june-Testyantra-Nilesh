package com.tyss.hibernateassesment.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateassesment.dto.ProductDTO;

import lombok.extern.java.Log;

@Log
public class ProductDAO {

	public static void main(String[] args) {

		price();
		nameStart();

	}

	public static void price() {
		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);
		Criterion criterion = Restrictions.le("price", 100.0);

		List<ProductDTO> product = criteria.add(criterion).list();

		for (ProductDTO productDTO : product) {
			log.info("" + productDTO.getPrice());
		}

	}

	public static void nameStart() {

		SessionFactory factory = HibernateUtil.getSessionfactory();
		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);
		Criterion criterion = Restrictions.ilike("productName", "A");

		List<ProductDTO> products = criteria.add(criterion).list();

		for (ProductDTO name : products) {
			log.info("" + name.getProductName());
		}

	}

}
