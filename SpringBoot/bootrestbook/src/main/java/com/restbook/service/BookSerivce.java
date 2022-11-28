package com.restbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restbook.entity.Book;

@Service
public class BookSerivce
{
	private static List<Book> list= new ArrayList<Book>();
	
	static
	{
		list.add(new Book(11, "Java Course", "Ashwani"));
		list.add(new Book(12, "Python Course","Anubhav"));
		list.add(new Book(13, "Course", "Ashi"));
		list.add(new Book(14, "Python ","Anu"));
		list.add(new Book(15, "Java", "Wani"));
		list.add(new Book(16, "C++ Course","Akash"));
	}
	
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	// get single book by id
	public Book getBookById(int id)
	{		
		Book book  = list.stream().filter(e->e.getId()==id).findFirst().get();
		
		return book;
	}
	
	// adding the book
	public Book addBook(Book b)
	{
		list.add(b);
		return b;
	}
	
//	deleting book
	public void deleteBook(int id)
	{
		list= list.stream().filter(e ->e.getId() != id).collect(Collectors.toList());
	}
	
	//update Book
	public void updateBook(Book book, int id)
	{
		list=list.stream().map(e->{
			if(e.getId() == id)
			{
				e.setTitle(book.getTitle());
				e.setAuthor(book.getAuthor());
			}
			return e;
		}).collect(Collectors.toList());
	}
}
