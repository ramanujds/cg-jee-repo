package com.cg.app.service;

import java.util.List;

import com.cg.app.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployeeById(int employeeId);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByName(String employeeName);
	
}
