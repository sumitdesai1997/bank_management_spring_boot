package com.bankmanagement.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest web){
		ExceptionResponse execptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), web.getDescription(false));
		
		return new ResponseEntity(execptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundExcpetion.class)
	ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundExcpetion userEx, WebRequest web){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), userEx.getMessage(), web.getDescription(false));
		
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}
