package com.garygml.app.dao.user;

import java.util.List;

import com.garygml.app.dao.GenericDao;
import com.garygml.app.entity.user.User;

public interface UserDao extends GenericDao<User> {
	
	public List<User> getAllUsers();
	
	public User findByUsername(String username);
}
