package com.cachingFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.lifecycle.Student;

public class FirstLeve {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		//by default enable
		 Student student = session.get(Student.class, 101);
		 System.out.println(student);
		 
		 session.close();

	}

}
