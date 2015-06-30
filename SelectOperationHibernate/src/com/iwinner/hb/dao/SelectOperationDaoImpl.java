package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class SelectOperationDaoImpl {

	/**
	 * @author anji@Iwnner.com
	 * @version 1.x
	 * @
	 * 
	 */
	public static void executeOperation() {

		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtils.sessionFactoryUtil();
			for(int i=9;i<49;i++){
			session = sessionFactory.openSession();

			Employee employee = new Employee();

		
			employee.setNo(i);
			employee.setFname("anji");
			employee.setLname("ks");
			employee.setMail("anjaiahspr@gmail.com");
			tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
			}
			// Close the sessions

		} catch (Exception e) {
			
			tx.rollback();
			
		} finally {
			
			HibernateUtils.closeSession(session);
			
		}

	}

	
	
	public static  void selectDetails(){
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory=HibernateUtils.sessionFactoryUtil();
			session=sessionFactory.openSession();
			
			// If record not here it will return null 
			Employee emp=(Employee)session.get(Employee.class, 10);
			System.out.println(emp);
			
			
			// if record  not found it is throws ObjectNotFoundException: No row with the given identifier exists
			/*Employee emp1=(Employee)session.load(Employee.class, 100);
			System.out.println(emp1);*/
          			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			HibernateUtils.closeSession(session);
		}
	}
}
