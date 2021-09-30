package com.cg.jdbcapp.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.jdbcapp.model.Department;

public interface DepartmentService {
	
	public Department getDepartment(int deptno)throws SQLException, IOException;
	
	public Department addDepartment(Department department) throws SQLException, IOException;
	
	
	
	

}
