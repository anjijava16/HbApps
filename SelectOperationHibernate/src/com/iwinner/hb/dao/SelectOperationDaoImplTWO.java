package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class SelectOperationDaoImplTWO {
	public static  void verifyLoadAndGetOpertionDifference(){
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory=HibernateUtils.sessionFactoryUtil();
			session=sessionFactory.openSession();
			
			// If record not here it will return null 
		    // Object obj=session.get(Employee.class, 10);
		    
		     
		     /*if(obj==null){
		    	 System.out.println("Employee Id is not found");
		     }else{
		    	 System.out.println("Employee Id is Found");
		     }
			*/
			
		     Employee emp=(Employee)session.get(Employee.class,10);
		     
		     System.out.println("Verification is stared ");
		     System.out.println("################################");
		     System.out.println("Verification is Ended ");
		     System.out.println(emp.toString());
		     
			
		     
		     // Load Testing
		     
		     Employee empLoad=(Employee)session.load(Employee.class,20);
		     System.out.println("Verification is stared ");
		     System.out.println("################################");
		     System.out.println("Verification is Ended ");
		     System.out.println(empLoad.toString());
		     
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
