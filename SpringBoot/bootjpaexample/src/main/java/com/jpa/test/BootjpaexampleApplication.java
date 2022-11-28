package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserReposistory;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserReposistory userReposistory = context.getBean(UserReposistory.class);
		/*
		 //create single data
		User s1=new User();
		s1.setName("Ashwani Kumar Chaurasiya");
		s1.setCity("Azamgarh");
		s1.setStatus("Student");
		
		User save1 = userReposistory.save(s1); //for single save object
		System.out.println(save1);
		*/
		
		/*
		 //create multiple data
		User s2=new User();
		s2.setName("Ankit Chaurasiya");
		s2.setCity("Kisunpur, Azamgarh");
		s2.setStatus("Beautiful");
	
		User s3=new User();
		s3.setName("Rani Chaurasiya");
		s3.setCity("Pambar, Azamgarh");
		s3.setStatus("D pharma");
		
		List<User> users = List.of(s2, s3); // java 9 features but in java 8 need to create ArrayList
		
		 Iterable<User> userIt= userReposistory.saveAll(users);  //save all objects by Itreble Class
		 
		 userIt.forEach(user->{System.out.println(user);});
		*/
		
		/*
		// update & get single data
		Optional<User> optional = userReposistory.findById(2);
		User user = optional.get(); // get single data from DB
		System.out.println(user);
//		User [id=2, name=Ankit Chaurasiya, city=Kisunpur, Azamgarh, status=Beautiful]
		user.setCity("Mau");
		System.out.println(user);
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
		userReposistory.save(user); // save in DB
		*/
		
		/*
		 // get multiple data
		// get all data from DB
		Iterable<User> findAll = userReposistory.findAll();
		findAll.forEach(e->{System.out.println(e);});
//		User [id=1, name=Ashwani Kumar Chaurasiya, city=Azamgarh, status=Student]
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]
		*/
		
		/*
		 // delete single data
		Iterable<User> findAll = userReposistory.findAll();
		findAll.forEach(e->{System.out.println(e);});
//		User [id=1, name=Ashwani Kumar Chaurasiya, city=Azamgarh, status=Student]
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]

			userReposistory.deleteById(1); // give Id here for delete
			findAll.forEach(e->{System.out.println(e);});
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]
		*/
		
		/*
		// Custom Finder method (by Name filter)
		List<User> findByName = userReposistory.findByName("Ankit Chaurasiya");
		findByName.forEach(e->{System.out.println(e);});
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
		
		// Custom Finder method (by Id filter)
		Optional<User> findById = userReposistory.findById(2);
		System.out.println(findById);
//		Optional[User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]]
		
		// Cutom Finder method (by Name And City)
		List<User> findByNameAndCity = userReposistory.findByNameAndCity("Rani Chaurasiya", "Pambar, Azamgarh");
		findByNameAndCity.forEach(e->{System.out.println(e);});
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]
		*/ 
		
		/*
		// custom Query by HQL
		List<User> allUsers = userReposistory.getAllUsers();
		allUsers.forEach(e->{System.out.println(e);});
//		User [id=1, name=Ashutosh, city=Lucknow, status=Polytechnic]
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]
	
		List<User> userByName = userReposistory.getUserByName("Ashwani");
		userByName.forEach(e->{System.out.println(e);});
//		User [id=4, name=Ashwani, city=Barabanki, status=Software]
		
		//custom query by Native query (mysql)
		userReposistory.getUser().forEach(e->{System.out.println(e);});
//		User [id=1, name=Ashutosh, city=Lucknow, status=Polytechnic]
//		User [id=2, name=Ankit Chaurasiya, city=Mau, status=Beautiful]
//		User [id=3, name=Rani Chaurasiya, city=Pambar, Azamgarh, status=D pharma]
//		User [id=4, name=Ashwani, city=Barabanki, status=Software]
		*/
	}

}
