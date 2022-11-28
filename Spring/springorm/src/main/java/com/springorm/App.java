package com.springorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        Student st1= new Student(01,"Ashwani Chaurasiya", "Azamgarh");
        int i= studentDao.insert(st1);
        System.out.println("done : "+i);
        boolean go=true;
        Scanner sc=new Scanner(System.in);
        
        while (go)
        {
        	System.out.println("Hey!!\nPlease choose below one...\n");
			System.out.println("press 1 for add student");
			System.out.println("press 2 for dispaly all student");
			System.out.println("press 3 for get details of single student");
			System.out.println("press 4 for delete student");
			System.out.println("press 5 for update student");
			System.out.println("press 6 for exit");
			
			int input=sc.nextInt();
			
			if(input==1)
			{
				
								
			}
			else if(input==2)
			{
				System.out.println("display ");
			}
			else if(input==3)
			{
				
			}
			
        }
	}
}
