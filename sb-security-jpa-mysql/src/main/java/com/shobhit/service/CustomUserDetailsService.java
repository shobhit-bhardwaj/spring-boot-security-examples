package com.shobhit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shobhit.dao.UserDao;
import com.shobhit.entity.CustomUserDetails;
import com.shobhit.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if(user == null)
			throw new UsernameNotFoundException("Unable to find the user - " + username);

		CustomUserDetails userDetails = new CustomUserDetails(user);

		return userDetails;
	}
}