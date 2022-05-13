package com.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
