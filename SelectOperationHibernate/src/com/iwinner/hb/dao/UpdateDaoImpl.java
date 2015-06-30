package com.iwinner.hb.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class UpdateDaoImpl {
public static void updateOperation(){
	
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction tx=null;
	try {
		sessionFactory=HibernateUtils.sessionFactoryUtil();
		
		session=sessionFactory.openSession();
		
		
		Employee employee=(Employee)session.get(Employee.class,10);
		
		employee.setFname("Ramehs");
		employee.setLname("arjun");
		
		tx=session.beginTransaction();
		tx.begin();
		session.update(employee);
		tx.commit();
		
	} catch (Exception e) {
		tx.rollback();
		e.printStackTrace();
		
		
	}finally{
		
		HibernateUtils.closeSession(session);
	}
	
	
}

}
