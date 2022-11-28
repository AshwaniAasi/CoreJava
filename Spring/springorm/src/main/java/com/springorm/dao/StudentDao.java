package com.springorm.dao;

import java.util.List;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
//-------------------------------------------------- Create Operation of CURD -------------------------------------------------------------
	// save Data
	@Transactional
	public int insert(Student student){
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------- Read Operation of CURD -------------------------------------------------------------
	//get the single data object
	public Student student( int studentId){
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	//get all data 
	public List<Student> getAllStudent(){
		List<Student> all = this.hibernateTemplate.loadAll(Student.class);
		return all;
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------ Update Operation of CURD ----------------------------------------------------------------
	//update the data
	@Transactional
	public void updateStudent(Student student)	{
		this.hibernateTemplate.update(student);
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------	
//------------------------------------------------- Delete Operation of CURD ------------------------------------------------------------------
	//for deleting data
	@Transactional
	public void deleteStudent(int studentId){
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------	


	public HibernateTemplate getHibernateTemplate() {	return hibernateTemplate;	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {	this.hibernateTemplate = hibernateTemplate;	}
	
	
}
