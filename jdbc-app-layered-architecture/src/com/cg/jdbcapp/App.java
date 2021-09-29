package com.cg.jdbcapp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.jdbcapp.dao.ConnectionUtil;
import com.cg.jdbcapp.exception.DepartmentNotFoundException;
import com.cg.jdbcapp.model.Department;
import com.cg.jdbcapp.service.DepartmentService;
import com.cg.jdbcapp.service.DepartmentServiceImpl;

public class App {

	public static void main(String[] args) {
		
		
//		int deptno;
//		String deptName;
//		String location;
//		
//		System.out.println("Enter Dept Details ");
//		
//		Scanner scan=new Scanner(System.in);
//		deptno=scan.nextInt();
//		
//		deptName=scan.next()+scan.nextLine();
//		
//		location=scan.nextLine();
//		
//		Department dept=new Department(deptno, deptName, location);
//		
		DepartmentService service=new DepartmentServiceImpl();
//		
//		try {
//			Department addedDepartment= service.addDepartment(dept);
//			System.out.println("Dept Added Successfully");
//			System.out.println(dept);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		System.out.println("Enter a Dept No. ");
		Scanner scan=new Scanner(System.in);
		int deptno=scan.nextInt();
		try {
			Department dept=service.getDepartment(deptno);
			System.out.println(dept);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (DepartmentNotFoundException e) {
			System.err.println("Error!! - "+e.getMessage());
		}
			
	}
	
}
