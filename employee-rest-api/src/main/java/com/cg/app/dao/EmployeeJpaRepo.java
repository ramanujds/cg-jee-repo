package com.cg.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.app.model.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee,Integer> {

	@Query("from Employee where employeeName=:employeeName")
	public Employee findByEmployeeName(String employeeName);
	
}
