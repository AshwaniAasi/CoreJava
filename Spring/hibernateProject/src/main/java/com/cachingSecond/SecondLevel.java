package com.cachingSecond;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.Student;

public class SecondLevel {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session1 = sessionFactory.openSession();
	//First
		Student st1=session1.get(Student.class, 123);
		System.out.println(st1);
		
		session1.close();
		
		Session session2 = sessionFactory.openSession();
	// Second
		Student st2=session2.get(Student.class, 124);
		session2.close();
		
		sessionFactory.close();
		

	}

}
