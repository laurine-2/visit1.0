package com.ecoleit.fap.visit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecoleit.fap.visit.dto.UserDTO;
import com.ecoleit.fap.visit.entity.User;
import com.ecoleit.fap.visit.repository.UserRepository;


@Service
public class UserService {
	
	private UserRepository repository;

	public UserService(UserRepository repository) {
		super();
		this.repository = repository;
	}
	
	public User getUser(String email) {
		return repository.findByEmail(email);
	}
	 

}
