package com.cg.app.dao;

import java.util.List;

import com.cg.app.model.Employee;

public interface EmployeeRepo {


	public Employee addEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployeeById(int employeeId);
	
	public List<Employee> getAllEmployees();
}
