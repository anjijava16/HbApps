package com.iwinner.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.iwinner.dto.EmpBean;
public class  TestClient
{
	public static void main(String[] args) throws Exception
	{
		
		
		// First Step 1:: BootStartp Class invoke framework
		Configuration conf=new Configuration();
		// Setting the config  file
		 conf=conf.configure("/mycfg-mysql.xml");
		 //conf.configure("/mycfg-mysql.xml");
		 
		 
		 // High level Object
		 SessionFactory sessionFactory=conf.buildSessionFactory();
		 
		 Session session=sessionFactory.openSession();
		 
         EmpBean eBean=new EmpBean();
         eBean.setNo(10);
         eBean.setFname("ABC");
         eBean.setLname("XYZ");
         eBean.setMail("ABC@gmail.com");
		 
         Transaction tx=session.beginTransaction();
         session.save(eBean);
         tx.commit();
        session.close();
         sessionFactory.close();
		 
		 /*
/// get HB Session obj connected to mysql DB s/w
		Configuration mysqlcfg=new Configuration();
		mysqlcfg=mysqlcfg.configure("/mycfg-mysql.xml");
		SessionFactory mysqlfactory=mysqlcfg.buildSessionFactory();
		Session mysqlses=mysqlfactory.openSession();

		// write HB persistance logic interacting with multiple DB s/w
		    // select a record from oracle DB s/w
			EmpBean eb=(EmpBean)orases.get(EmpBean.class,new Integer(1010));
			//insert the record into mysql DB s/w
			Transaction  tx=mysqlses.beginTransaction();
			     mysqlses.save(eb);
		    tx.commit();

			//close sesion objs
			orases.close();
			mysqlses.close();
			//close sessionfactory objs
			orafactory.close();
			mysqlfactory.close();
*/	}//main
}//class
