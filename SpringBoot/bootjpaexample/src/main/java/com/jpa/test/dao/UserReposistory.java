package com.jpa.test.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entity.User;

public interface UserReposistory extends CrudRepository<User, Integer> 
{
	// Custom Finder method JPQL
	public List<User> findByName(String name);
	public Optional<User> findById(Integer id);
	public List<User> findByNameAndCity(String name, String city);
	
	
	// Executing HQL
	@Query("select u from User u")
	public List<User> getAllUsers();
	//HQL Parameteries Query
	@Query("select u from User u where u.name = :n")
	public List<User> getUserByName(@Param("n") String name);
	
	//native query for sql
	@Query(value="select * from user", nativeQuery = true)
	public List<User> getUser();
	

}
