package com.springrest.entity;

import javax.persistence.Id;
import javax.persistence.Entity;


@Entity
public class Course 
{
	@Id
	private int id;
	private String title;
	private String discreption;
	
	public Course(int id, String title, String discreption) {
		super();
		this.id = id;
		this.title = title;
		this.discreption = discreption;
	}
	
	public Course() {
		super();
	}
	
	public int getId() {return id;	}
	public void setId(int id) {	this.id = id;	}
	
	public String getTitle() {	return title;	}
	public void setTitle(String title) {	this.title = title;	}
	
	public String getDiscreption() {	return discreption;	}
	public void setDiscreption(String discreption) {	this.discreption = discreption;	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discreption=" + discreption + "]";
	}
	
	
	
}
