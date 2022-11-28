package com.hibernate.criteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.mappingXML.Person;
import com.spring.hibernate.Student;

public class CriteriaCode {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c= session.createCriteria(Student.class);
		
		c.add(Restrictions.eq("name", "Ashwani"));
		
		
		List<Student> list= c.list();
		for(Student p:list)
		{
			System.out.println(p);
		}
		session.close();
		
	}

}
