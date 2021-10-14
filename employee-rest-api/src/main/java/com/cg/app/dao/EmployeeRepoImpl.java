package com.cg.app.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.app.model.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{
	
	Map<Integer,Employee> employees;
	
	List<Employee> emps;
	
	@PostConstruct
	public void init() {
		employees=new HashMap<>();
		
		Employee e1=new Employee(1001,"Mahesh Dutta",65000,LocalDate.of(1996,10,25));
		Employee e2=new Employee(1002,"Ramesh Dutta",55000,LocalDate.of(1995,10,24));
		Employee e3=new Employee(1003,"Suresh Dutta",45000,LocalDate.of(1994,5,17));
		
		employees.put(e1.getEmployeeId(),e1);
		employees.put(e2.getEmployeeId(),e2);
		employees.put(e3.getEmployeeId(),e3);
		
	}
	

	@Override
	public Employee addEmployee(Employee employee) {
		employees.put(employee.getEmployeeId(),employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return employees.get(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employees.put(employee.getEmployeeId(),employee);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		
		employees.remove(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		emps=new ArrayList<>();
		employees.forEach((id,emp)->emps.add(emp));
		
		return emps;
		
		
	}

	
	
	
}
