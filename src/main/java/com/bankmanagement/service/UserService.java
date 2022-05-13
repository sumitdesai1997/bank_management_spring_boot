package com.bankmanagement.service;

import org.springframework.http.ResponseEntity;

import com.bankmanagement.entity.User;

public interface UserService {

	ResponseEntity<User> createUser(User user);
}
