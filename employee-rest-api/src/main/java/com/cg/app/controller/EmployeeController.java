package com.cg.app.controller;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/hello")
//	@ResponseBody
	public String sayHello() {
		return "Hello Everyone";
	}
	
	@GetMapping("/employee")
	public Employee getEmployee() {
		Employee emp=new Employee(1001,"Mahesh",65400,LocalDate.of(1995,10,10));
		return emp;
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employee;
		
	}
	
	
}
