package com.cg.app.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.app.dto.ErrorResponse;
import com.cg.app.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmployeeErrorController {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(code= HttpStatus.NOT_FOUND)
	public ErrorResponse handleEmployeeNotFoundError(EmployeeNotFoundException ex, HttpServletRequest request) {
		
		return new ErrorResponse(new Date(),
				HttpStatus.NOT_FOUND,
				ex.getClass().getCanonicalName(),
				ex.getMessage(),
				request.getRequestURI()
				);
		
	}
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleError(Exception ex, HttpServletRequest request) {
		
		return new ErrorResponse(new Date(),
				HttpStatus.INTERNAL_SERVER_ERROR,
				ex.getClass().getCanonicalName(),
				ex.getMessage(),
				request.getRequestURI()
				);
		
	}
	
}
