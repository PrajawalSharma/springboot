package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.LoginDTO;
import com.example.demo.Entity.Add;
import com.example.demo.Entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;


	@GetMapping("/Login")
	public String  get(@RequestBody LoginDTO login) {
		
		return service.loginCheck(login);
	}
	
	@GetMapping("/getName")
	public List<Add> getEmployeeByName(@RequestBody Add add) {
		return service.getEmployeeByName(add.getName());
	}
	
	@GetMapping("/getSalary")
	public List<Add> getEmployeeBySalary(@RequestBody Add add) {
		return service.getEmployeeBySalary(add.getSalary());
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Add add) {
		return service.saveEmployee(add);
	}
	
	@PostMapping("/saveAdmin")
	public String saveAdmin(@RequestBody Employee employee) {
		return service.saveAdmin(employee);
	}
	

	
}
