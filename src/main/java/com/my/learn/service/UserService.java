package com.my.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.my.learn.domain.User;
import com.my.learn.exception.UserNotFoundException;


public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> getAllUser();
	
	public Optional<User> getUserById(Long Id) throws UserNotFoundException;
	
	public void deleteUserById(Long Id);

}
