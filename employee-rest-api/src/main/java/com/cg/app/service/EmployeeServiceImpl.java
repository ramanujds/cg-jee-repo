package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.dao.EmployeeRepo;
import com.cg.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return repo.getEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.updateEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		repo.deleteEmployeeById(employeeId);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.getAllEmployees();
	}

}
