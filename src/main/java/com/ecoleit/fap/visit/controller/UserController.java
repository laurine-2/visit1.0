package com.ecoleit.fap.visit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecoleit.fap.visit.dto.UserDTO;
import com.ecoleit.fap.visit.entity.User;
import com.ecoleit.fap.visit.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public User getLogin(@RequestParam String email) {
		return service.getUser(email);
	}

	
 
}
