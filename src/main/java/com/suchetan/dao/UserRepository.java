package com.suchetan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.suchetan.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	//Custom Query
	public List<User> findByName(String name);
	
	//JPQL
	@Query("select u from User u Where u.name=:n")
	public List<User> getByName(@Param("n") String name);
	
	//Native Query
	
	@Query(value="select * from User Where city =:c", nativeQuery=true)
	public List<User> getByCity(@Param("c") String city);
}
