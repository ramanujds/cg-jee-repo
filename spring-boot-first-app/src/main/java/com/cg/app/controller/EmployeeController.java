package com.cg.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.app.model.Employee;

@Controller
public class EmployeeController {

	

//	@GetMapping("/employee")
//	public ModelAndView getEmployeeDetails(@RequestParam("empidtxt") int id, 
//											@RequestParam("empnametxt") String name,
//											@RequestParam("emailtxt") String email) {
//		
//		Employee emp=new Employee(id,name,email);
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("show.jsp");
//		mv.addObject("emp",emp);
//		return mv;
//		
//		
//	}
	
	
	@GetMapping("/employee")
	public String getEmployeeDetails(@ModelAttribute("emp") Employee emp) {
		return "show";
	}
	
	
}
