package com.cg.jdbcapp.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.jdbcapp.model.Department;

public interface DepartmentDao {

	public Department addDepartment(Department department) throws SQLException, IOException;
	
	public Department getDepartment(int deptNo) throws SQLException, IOException;
	
	public boolean deleteDepartment(int deptNo);
	
	public List<Department> getAllDepartments();
	
	public Department upadteDepartment(Department department);
	
	
	
}
