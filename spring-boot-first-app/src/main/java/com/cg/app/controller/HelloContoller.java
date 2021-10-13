package com.cg.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloContoller  {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello.jsp";
	}
	
	
}
