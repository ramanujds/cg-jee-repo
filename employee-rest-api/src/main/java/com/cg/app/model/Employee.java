package com.cg.app.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int employeeId;
	private String employeeName;
	private float salary;
	private LocalDate dob;
	
}
