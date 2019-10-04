package com.h2example.h2example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h2example.h2example.DAO.PersonDAO;
import com.h2example.h2example.entity.Person;

@Controller
public class MainController {
	
	@Autowired
	private PersonDAO personDAO;
	
	@ResponseBody
	@RequestMapping("/h2")
	public String index() {
		Iterable<Person> all = personDAO.findAll();
		
		StringBuilder sb = new StringBuilder();
		all.forEach(person -> sb.append("Full Name : "+person.getFullName()+"  DOB : "+ person.getDateOfBirth() + "<br>"));
		
		return sb.toString();
		}
}
