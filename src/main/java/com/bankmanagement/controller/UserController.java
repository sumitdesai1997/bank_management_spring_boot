package com.bankmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankmanagement.entity.User;
import com.bankmanagement.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/users")
	ResponseEntity<User> createUser(@RequestBody User user){
		return userServiceImpl.createUser(user);
	}
	
	@GetMapping("/users/{id}")
	User getUser(@PathVariable int id) {
		return userServiceImpl.getUser(id);
	}
	
	@GetMapping("/users")
	List<User> getAllUser(){
		return userServiceImpl.getAllUser();
	}
	
	@PutMapping("/users")
	User createOrUpdateUser(@RequestBody User user) {
		return  userServiceImpl.createOrUpdateUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	User deleteUser(@PathVariable int id) {
		return userServiceImpl.deleteUser(id);
	}
	
	@PutMapping("users/{id}/deposit/{amount}")
	User depositAmount(@PathVariable int id, @PathVariable int amount) {
		return userServiceImpl.depositAmount(id, amount);
	}
	
	@PutMapping("users/{id}/withdraw/{amount}")
	User withdrawAmount(@PathVariable int id, @PathVariable int amount) {
		return userServiceImpl.withdrawAmount(id, amount);
	}
	
}
