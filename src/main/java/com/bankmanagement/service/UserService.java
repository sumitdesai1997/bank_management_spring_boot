package com.bankmanagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bankmanagement.entity.User;

public interface UserService {

	ResponseEntity<User> createUser(User user);
	
	User getUser(int id);
	
	List<User> getAllUser();
}
