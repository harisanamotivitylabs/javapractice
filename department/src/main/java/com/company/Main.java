package com.company;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();

 Employee emp=new Employee();
 
 
      Query qu=s.createQuery("delete from Employee where empid=104 ");
      
     // qu.setParameter("id", 501);
      
 
		/*emp.setEmpid(104);
		emp.setName("jacks");
		emp.setSalary(38000);
		*/
		qu.executeUpdate();
		
		//s.save(emp);;
		tx.commit();
		s.close();
		
		
		
	}

}
