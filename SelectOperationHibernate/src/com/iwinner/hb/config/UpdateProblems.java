package com.iwinner.hb.config;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class UpdateProblems {
	
	public static void updateProblem(){
			SessionFactory sFactory=HibernateUtils.sessionFactoryUtil();
			Session session1=sFactory.openSession();
			Employee emp1=null;
			Object obj=session1.get(Employee.class, 10);
               emp1=(Employee)obj;
			session1.close();
			
			emp1.setFname("rakkkki");
			
			Session session2=sFactory.openSession();
			Employee emp2=(Employee)session2.get(Employee.class, 10);
			Transaction tx=session2.beginTransaction();
			session2.update(emp1);
			//Exception in thread "main" org.hibernate.NonUniqueObjectException: a different object with the same identifier value was already associated with the session: [com.iwinner.hb.dto.Employee#10]
			tx.commit();
		 }
	public static void mergeSlove(){
		SessionFactory sFactory=HibernateUtils.sessionFactoryUtil();
		Session session1=sFactory.openSession();
		Employee emp1=null;
		Object obj=session1.get(Employee.class, 10);
           emp1=(Employee)obj;
		
           session1.close();// Here session1 objet is here detached state 
		
		emp1.setFname("lsopkk");
		
		Session session2=sFactory.openSession();
		Employee emp2=(Employee)session2.get(Employee.class, 10);
		Transaction tx=session2.beginTransaction();
		session2.merge(emp1);
		tx.commit();
	 }
	public static void main(String[] args) {
		updateProblem();
		//mergeSlove();
	}
}
