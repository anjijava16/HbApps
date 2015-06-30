package com.iwinner.hb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class SelectionDaoImpl {

public static void getOperations(){
	SessionFactory sessionFactory=null;
	Session session=null;
	try{
		sessionFactory=HibernateUtils.sessionFactoryUtil();
	
	 session=sessionFactory.openSession();
	
	Object obj=session.get(Employee.class, 10);
	
	if(obj==null){
		System.out.println("Employee ID is not avaiable");
	}else{
		System.out.println("Employeee is Found");
	}
	
	Employee emp=(Employee)obj;
	
	
	
	System.out.println(emp.toString());
	
	}catch(Exception e){
       
		e.printStackTrace();		
       
	}finally{
		
		HibernateUtils.closeSession(session);
	}
	
}
public static void loadOperation(){
	SessionFactory sessionFactory=null;
	Session session=null;
	try{
		sessionFactory=HibernateUtils.sessionFactoryUtil();
	
	 session=sessionFactory.openSession();
	
	Object obj=session.load(Employee.class, 10);
	
	Employee emp=(Employee)obj;
	System.out.println(emp);
	/*
	System.out.println(emp.toString());*/
	
	}catch(Exception e){
	e.printStackTrace();	
	}
}

}
