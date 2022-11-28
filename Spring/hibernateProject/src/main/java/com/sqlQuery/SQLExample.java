package com.sqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.spring.hibernate.Student;

public class SQLExample {

	public static void main(String[] args) {
		
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	//SQL Query	
	NativeQuery nativeQuery = session.createSQLQuery("Select * from Student");
	
	List <Object[]> list=nativeQuery.list();
	
	for(Object[] st:list)
	{
		System.out.println(Arrays.deepToString(st));
	}
	
	session.close();
	sessionFactory.close();

	}

}
