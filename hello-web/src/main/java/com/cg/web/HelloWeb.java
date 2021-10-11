package com.cg.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/helloweb","/helloservlet"})
public class HelloWeb extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3018897250336170967L;
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setHeader("Content-Type", "text/html");
		response.getWriter().println("<h2>Hi I am a Servlet</h2>");
		
	}
	
	
}
