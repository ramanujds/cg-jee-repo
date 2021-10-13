package com.cg.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.app.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/employee")
	public ModelAndView getEmployeeDetails() {
		
		Employee emp=new Employee(10001,"Rahul Dutta","rahul@gmail.com");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show.jsp");
		mv.addObject("emp",emp);
		return mv;
		
		
	}
	
	
	
}
