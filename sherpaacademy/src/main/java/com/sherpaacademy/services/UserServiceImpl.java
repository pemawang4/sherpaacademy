package com.sherpaacademy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherpaacademy.models.User;
import com.sherpaacademy.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUserDetails(User user) {
		userRepository.save(user);
		return user;
	}
	
	
}
