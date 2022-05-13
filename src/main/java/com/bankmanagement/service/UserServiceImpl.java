package com.bankmanagement.service;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bankmanagement.entity.User;
import com.bankmanagement.exception.UserNotFoundExcpetion;
import com.bankmanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public ResponseEntity<User> createUser(User user) {
		User createdUser = userRepository.save(user);
		
		URI location = ServletUriComponentsBuilder
						.fromCurrentRequest()
						.path("/{id}")
						.buildAndExpand(createdUser.getUserId())
						.toUri();
		
		return ResponseEntity.created(location).build();
	}

	@Override
	public User getUser(int id) {
		Optional<User> user = userRepository.findById(id);
		
		if(!user.isPresent()) {
			throw new UserNotFoundExcpetion("user with id: " + id + " not found");
		}
		
		return user.get();
	}

}
