package com.alatoo.midterm.service;

import com.alatoo.midterm.model.User;
import com.alatoo.midterm.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
