package com.cg.jdbcapp.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.jdbcapp.model.Department;

public class DepartmentDaoCollectionBasedImpl implements DepartmentDao {

	Map<Integer, Department> departmentList=new HashMap<Integer, Department>();
	
	@Override
	public Department addDepartment(Department department) throws SQLException, IOException {
		
		return departmentList.put(department.getDeptno(), department);
		
		
	}

	@Override
	public Department getDepartment(int deptNo) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDepartment(int deptNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department upadteDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
