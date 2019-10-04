package com.h2example.h2example.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "PERSON")
@Getter
@Setter
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "Full_Name", length = 64, nullable = false)
	private String fullName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "Date_Of_Birth", nullable = false)
	private Date dateOfBirth;
}	
