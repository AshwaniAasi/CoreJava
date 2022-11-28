package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.mapping.Answer;
import com.spring.mapping.Question;

public class Cascading {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question q1=new Question();
		q1.setQuesId(101);
		q1.setQues("What is hibernate?");
		
		Answer answer = new Answer(2365, "In hibernate is very important concepts");
		Answer answer2 = new Answer(2366, "In hibernate is waste topic");
		Answer answer3 = new Answer(2367, "In hibernate is very important to learn");
		
		List<Answer> list= new ArrayList<>();
		
		list.add(answer);
		list.add(answer2);
		list.add(answer3);
		
		q1.setAnswer((Answer) list);
		Transaction transaction = session.beginTransaction();
		session.save(q1);
		
		session.save(answer);
		session.save(answer2);
		session.save(answer3);
		
		transaction.commit();
		session.close();
		factory.close();
		
		
	}

}
