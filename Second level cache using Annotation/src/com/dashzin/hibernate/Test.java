package com.dashzin.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
				cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		SID s=new SID();
		s.setSid(102);
		s.setName("Sath");
		
		/*Student st=new Student();
		st.setEmail("Sath@024");
		st.setPhone(99987654);
		st.setId(s);
		ss.save(st);*/
		
		Session ss1=sf.openSession();
		
	Query query=ss1.createQuery("from Student");
	query.setCacheable(true);
	List<Student > list=query.list();
	for(Student s1:list)
		System.out.println(s1);
	
		
		
		//ss.save(st);
	
		
		tx.commit();
		ss.close();
		
		
	}

}
