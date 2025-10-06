package com.my.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.learn.domain.User;

@RestController
public class MyRestController {
	
	@RequestMapping(method=RequestMethod.GET, path="/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/getUserBean")
	public User getUserBean() {
		return new User("MyfirstName","MyLastName","Maywood");
	}
	
}
