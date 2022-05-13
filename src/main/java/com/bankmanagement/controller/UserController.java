package com.bankmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankmanagement.entity.User;
import com.bankmanagement.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/user")
	ResponseEntity<User> createUser(@RequestBody User user){
		return userServiceImpl.createUser(user);
	}
	
}
