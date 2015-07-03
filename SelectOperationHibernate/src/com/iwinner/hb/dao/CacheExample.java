package com.iwinner.hb.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.iwinner.hb.dto.Employee;
import com.iwinner.hb.utils.HibernateUtils;

public class CacheExample {
	public static void cacheOps(){
		try {
			SessionFactory sFactory=HibernateUtils.sessionFactoryUtil();
			Session session=sFactory.openSession();
			Employee emp1=(Employee)session.get(Employee.class, 10);
			System.out.println("Emp1===>>>"+emp1);
			
			//session.clear();// Clear entire info
			
			//session.evict(emp1); //clear for particular Object
			
			Employee emp2=(Employee)session.get(Employee.class, 10);
			System.out.println("Emp2===>>>"+emp2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		cacheOps();
	}
}
