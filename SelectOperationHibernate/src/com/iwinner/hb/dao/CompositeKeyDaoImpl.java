package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hb.dto.Product;
import com.iwinner.hb.utils.HibernateUtils;

public class CompositeKeyDaoImpl {

	public static void compostieKeyOperation() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = HibernateUtils.sessionFactoryUtil();
			session = sessionFactory.openSession();
			Product p = new Product();
			p.setProductId(101);
			p.setProName("iPhone");
			p.setPrice(25000);
			// I am creating P object here p Object
			Transaction tx = session.beginTransaction();
			session.save(p);
			System.out.println("Object Loaded successfully.....!!");
			tx.commit();
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		compostieKeyOperation();
	}
}
