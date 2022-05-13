package com.bankmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserNotFoundExcpetion extends RuntimeException {

	public UserNotFoundExcpetion(String message) {
		super(message);
	}


}
