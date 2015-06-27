package com.iwinner.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;

public class DeleteOperation {
	public static void main(String[] args) throws Exception
	{
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf=new Configuration();
		
		// Setting the config  file
		 conf=conf.configure("/mycfg-mysql.xml");
		 SessionFactory sessionFactory=conf.buildSessionFactory();

/*
		 // Update Operation
		 Session session=sessionFactory.openSession();
		 
         EmpBean eBean=new EmpBean();
         eBean.setNo(10);
         eBean.setFname("ravi");
         eBean.setLname("s");
         eBean.setMail("sheakr@gmail.com");
         Transaction tx=session.beginTransaction();
         
         
         
         session.update(eBean);
         
         
         tx.commit();
         session.close();
         sessionFactory.close();

*/
		 // Delete Operation
		 Session session=sessionFactory.openSession();
         EmpBean eBean=new EmpBean();
         eBean.setNo(10);
      /*   eBean.setFname("Anji");
         eBean.setLname("M");
         eBean.setMail("main@gmail.com");*/
		 
         Transaction tx=session.beginTransaction();
         session.delete(eBean);
         tx.commit();
         session.close();
         sessionFactory.close();

         
		 // Insert Operation
		 /*Session session=sessionFactory.openSession();
         EmpBean eBean=new EmpBean();
         eBean.setNo(50);
         eBean.setFname("Anji");
         eBean.setLname("M");
         eBean.setMail("main@gmail.com");
		 
         Transaction tx=session.beginTransaction();
         session.save(eBean);
         tx.commit();*/
		 

		 // persistatnce()  Operation
		 /*Session session=sessionFactory.openSession();
         EmpBean eBean=new EmpBean();
         eBean.setNo(20);
         eBean.setFname("ravi");
         eBean.setLname("s");
         eBean.setMail("sheakr@gmail.com");
         Transaction tx=session.beginTransaction();
         session.persist(eBean);
         tx.commit();
         session.close();
         sessionFactory.close();*/
	}
}
