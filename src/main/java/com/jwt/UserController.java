package com.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/sign-up")
	public void signUp(@RequestBody User user){
		user.setPassword(new BCryptPasswordEncoder().encode(user.password));
		repo.save(user);
	}

}
