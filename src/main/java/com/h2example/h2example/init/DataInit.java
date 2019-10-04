package com.h2example.h2example.init;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.h2example.h2example.DAO.PersonDAO;
import com.h2example.h2example.entity.Person;

@Component
public class DataInit implements ApplicationRunner {
	
	private PersonDAO personDAO;
	private static final DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	 public DataInit(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = personDAO.count();
		
		if(count == 0) {
	
			Person p1 = new Person();
			p1.setFullName("Gaurav Sharma");
			
			 Date d1 = DATEFORMAT.parse("1995-01-12");
			 p1.setDateOfBirth(d1);
			 
			 Person p2 = new Person();
			 p2.setFullName("Pritesh Singh");
			 
			 Date d2 = DATEFORMAT.parse("1900-11-11");
			 p2.setDateOfBirth(d2);
			 
			 personDAO.save(p1);
			 personDAO.save(p2);
		}
		
	}

}
