package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.User;
import com.cg.app.service.GithubUserDetailsService;

@Controller
public class UserController {
	
	@Autowired
	GithubUserDetailsService service;

	@GetMapping("get-user")
	public String getUserDetails(@RequestParam("usernametx") String username, Model model) {
		
		
		User user= service.getUserDetails(username);
		model.addAttribute("user",user);
		return "show-user.jsp";
		
	}
	
	
}
