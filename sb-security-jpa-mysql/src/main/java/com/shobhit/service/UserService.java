package com.shobhit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shobhit.dao.UserDao;
import com.shobhit.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public User addUser(User user) {
		return userDao.save(user);
	}
}