package com.my.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.learn.domain.User;
import com.my.learn.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/ping")
	public String ping() {
		return "pong";
	}
	
	@PostMapping("/user/saveUser")
	public User saveUser() {
		return null;
	}
	
	@GetMapping("/user/getAllUser")
	public List<User> getAllUser(){
	return	userService.getAllUser();
	}

	@PostMapping("/user/createUser")
	public User createUser(@RequestBody User user) {
		System.out.println(user);
		return userService.saveUser(user);
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long Id){
	return	userService.getUserById(Id);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable("id") Long Id){
		userService.deleteUserById(Id);
	}
	
}
