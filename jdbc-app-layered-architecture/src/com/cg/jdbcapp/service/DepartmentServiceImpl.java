package com.cg.jdbcapp.service;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.jdbcapp.dao.DepartmentDao;
import com.cg.jdbcapp.dao.DepartmentDaoCollectionBasedImpl;
import com.cg.jdbcapp.dao.DepartmentDaoImpl;
import com.cg.jdbcapp.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao dao;
	
	public DepartmentServiceImpl() {
		dao=new DepartmentDaoImpl();
	}
	
	@Override
	public Department addDepartment(Department department) throws SQLException, IOException {
		
		return dao.addDepartment(department);
		
	}
	
	@Override
	public Department getDepartment(int deptno) throws SQLException, IOException {
		
		return dao.getDepartment(deptno);
	
	}
}
