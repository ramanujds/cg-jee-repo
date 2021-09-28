package com.cg.jdbcapp.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cg.jdbcapp.model.Department;

public class DepartmentDaoImpl implements DepartmentDao {

	Connection con;
	ResultSet rs;
	
	@Override
	public Department addDepartment(Department department) throws SQLException, IOException {
		con=ConnectionUtil.getConnection();
		
		String query = "insert into dept values(?,?,?)";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setInt(1, department.getDeptno());
		psmt.setString(2, department.getDeptName());
		psmt.setString(3, department.getLocation());
		
		int rows=psmt.executeUpdate();
		if(rows>0) {
			return department;
		}
		
		return null;
		
	}

	@Override
	public Department getDepartment(int deptNo) throws SQLException, IOException {
		
		con=ConnectionUtil.getConnection();
		
		String query = "select * from dept where deptno=?";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setInt(1, deptNo);
		rs=psmt.executeQuery();
		Department department=null;
		if(rs.next()) {
			
			String deptName=rs.getString("dname");
			String location=rs.getString("location");
			department=new Department(deptNo,deptName,location);
					
		}
		return department;
		
		
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
