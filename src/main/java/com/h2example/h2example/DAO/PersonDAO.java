package com.h2example.h2example.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.h2example.h2example.entity.Person;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long>{
	
	public List<Person> findByFullNameLike(String name);
	public List<Person> findByDateOfBirthGreaterThan(Date date);
}
