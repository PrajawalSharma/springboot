package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private Integer number;
<<<<<<< HEAD
	private String email;
	private String password;
	private Integer number;
=======

	private String password;
	private Integer number;
	
>>>>>>> 21a72ed20b41475cf0b1aff234f12a2b37e5d38e
}