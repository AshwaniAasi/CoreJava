package com.hibernate.mappingXML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Person person1 = new Person(23, "Ashwani", "Azamgarh", "7007581106");
		Person person2 = new Person(24, "Ashi", "Lucknow", "700756");
		Person person3 = new Person(21, "1wani", "A1garh", "700106");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(person1);
		session.save(person2);
		session.save(person3);
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		

	}

}
