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
<<<<<<< HEAD
	private String email;
	private String password;
	private Integer number;
=======
=======
>>>>>>> 418ed4c02299dc2eb8fd2a0251d69116501fedf9

	private String password;
	private Integer number;
	
<<<<<<< HEAD
>>>>>>> 4c4208d (Done the changes in employee entity)
=======
>>>>>>> 418ed4c02299dc2eb8fd2a0251d69116501fedf9
}