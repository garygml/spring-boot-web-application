package com.garygml.app.dao.user.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.garygml.app.dao.JpaDao;
import com.garygml.app.dao.user.UserDao;
import com.garygml.app.entity.user.User;

@Repository
public class UserDaoImpl extends JpaDao<User> implements UserDao {

	private static final String GET_ALL_USER = "SELECT u FROM User u";

	private static final String GET_USER_BY_USERNAME = "SELECT u FROM User u " 
														+ "WHERE u.username = :username "
														+ "AND u.status = 'A' ";

	@Override
	public List<User> getAllUsers() {
		return getEntityManager().createQuery(GET_ALL_USER, User.class).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(String username) {
		Query query = getEntityManager().createQuery(GET_USER_BY_USERNAME, User.class);
		query.setParameter("username", username);
		List<User> userList = query.getResultList();
		if (null != userList && userList.size() > 0) {
			return userList.get(0);
		}

		return null;
	}

}
