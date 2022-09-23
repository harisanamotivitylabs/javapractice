package com.school;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf= cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Student hari=new Student();
		Student hari1=new Student();
		
		
		hari1.setId(102);
		hari1.setName("harika");
		hari1.setMarks(100);
		hari.setId(101);
		hari.setName("bhaskar");
		hari.setMarks(101);
		
		s.save(hari);
		s.save(hari1);
		tx.commit();
		
		s.close();
	}

}

