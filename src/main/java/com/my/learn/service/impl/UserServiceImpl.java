package com.my.learn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.learn.dao.UserDAO;
import com.my.learn.domain.User;
import com.my.learn.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
	
	public Optional<User> getUserById(Long Id){
		Optional<User> optional=userDAO.findById(Id);
		
		return optional;
	}

	@Override
	public void deleteUserById(Long Id) {
		// TODO Auto-generated method stub
		 userDAO.deleteById(Id);;
	}

}
