package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.dto.Product;
import com.iwinner.hb.utils.HibernateUtils;

public class EmployeeDaoImpl {
	
	public static void startOperation(){
		
		
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		try {
			sessionFactory=HibernateUtils.sessionFactoryUtil();
			session=sessionFactory.openSession();
	      Product prod=new Product();
	      prod.setPrice(5000d);
	      prod.setProName("TV");
			tx=session.beginTransaction();
			 session.save(prod);
			 tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			HibernateUtils.closeSession(session);
		}
		
	}
	public static void main(String[] args) {
		startOperation();
	}
}
