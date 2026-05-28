package com.itsaga.validation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsaga.validation.dto.UserRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@PostMapping
	public String registerUser(@Valid @RequestBody UserRequest request) {
		return "User registered successfully";
	}

}

/*
@Valid-------->This triggers validation automatically.

Without @Valid: annotations do nothing
*/