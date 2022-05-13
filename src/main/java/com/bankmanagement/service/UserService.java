package com.bankmanagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bankmanagement.entity.User;

public interface UserService {

	ResponseEntity<User> createUser(User user);
	
	User getUser(int id);
	
	List<User> getAllUser();
	
	User createOrUpdateUser(User user);
	
	User deleteUser(int id);
	
	User depositAmount(int id, int amount);
	
	User withdrawAmount(int id, int amount);
}
