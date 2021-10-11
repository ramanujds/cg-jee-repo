package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("emailtxt");
		
		PrintWriter out=response.getWriter();
		
		response.setHeader("Content-Type", "text/html");
		
		out.print("<html>");
		
		out.print("<head><title>Hello</title></head>");
		
		out.print("<body>");
		
		out.print("<h1>"+email+"</h1>");
		
		out.print("</body></html>");
		
		
	}

}
