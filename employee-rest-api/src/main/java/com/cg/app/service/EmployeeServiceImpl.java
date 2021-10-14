package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.EmployeeJpaRepo;
import com.cg.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeJpaRepo repo;

	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return repo.findById(employeeId).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		repo.deleteById(employeeId);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		
		return repo.findByEmployeeName(employeeName);
	}
	
	

}
