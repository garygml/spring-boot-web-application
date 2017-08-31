package com.garygml.app.service.user;

import java.util.List;

import com.garygml.app.entity.user.User;
import com.garygml.app.service.GenericService;

public interface UserService extends GenericService<User>{
	
	List<User> getAllUsers();
	
	User findByUsername(String username);
}
