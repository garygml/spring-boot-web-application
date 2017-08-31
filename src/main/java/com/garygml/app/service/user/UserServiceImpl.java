package com.garygml.app.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garygml.app.dao.user.UserDao;
import com.garygml.app.entity.user.User;
import com.garygml.app.service.JpaService;

@Service
public class UserServiceImpl extends JpaService<User> implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}




	
}
