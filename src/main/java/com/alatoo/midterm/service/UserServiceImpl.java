package com.alatoo.midterm.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.alatoo.midterm.model.Role;
import com.alatoo.midterm.model.User;
import com.alatoo.midterm.repository.UserRepository;
import com.alatoo.midterm.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirsName(),
				registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

}
