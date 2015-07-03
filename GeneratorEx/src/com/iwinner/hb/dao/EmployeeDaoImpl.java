package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class EmployeeDaoImpl {
	
	public static void startOperation(){
		
		
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction tx=null;
		try {
			sessionFactory=HibernateUtils.sessionFactoryUtil();
			session=sessionFactory.openSession();
			Employee emp=new Employee();
			//emp.setNo(14);
			emp.setFname("anji");
			emp.setLname("raj");
			emp.setMail("anjia@gmail.com");
			 tx=session.beginTransaction();
			 session.save(emp);
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
