package com.cg.app.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Employee;
import com.cg.app.service.EmployeeService;


@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
	
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
 
	
	@Autowired
	EmployeeService service;

	@GetMapping("/hello")
//	@ResponseBody
	public String sayHello() {
		return "Hello Everyone";
	}
	
	@GetMapping("/employee-id/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
		
		Employee emp = service.getEmployeeById(employeeId);
		
		if(emp==null) {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		
		log.info("Feched Employee");
		
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return service.addEmployee(employee);
		
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/employee-id/{employeeId}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int employeeId) {
		
		Employee emp = service.getEmployeeById(employeeId);
		
		if(emp==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		service.deleteEmployeeById(employeeId);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/name/{employeeName}")
	public ResponseEntity<Employee> getEmployeeByName(@PathVariable String employeeName) {
		return new ResponseEntity<>(service.getEmployeeByName(employeeName),HttpStatus.OK);
		
	}
	
	
}
