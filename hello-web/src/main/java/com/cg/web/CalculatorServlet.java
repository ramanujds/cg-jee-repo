package com.cg.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num1,num2,sum;
		
		num1=Integer.parseInt(request.getParameter("num1tx"));
		num2=Integer.parseInt(request.getParameter("num2tx"));
		
		sum=num1+num2;
		
		response.getWriter().print("Sum = "+sum);
		
		
	}

}
