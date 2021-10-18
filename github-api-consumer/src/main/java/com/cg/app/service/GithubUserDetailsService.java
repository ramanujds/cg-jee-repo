package com.cg.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.app.model.User;

@Service
public class GithubUserDetailsService {

	@Autowired
	RestTemplate rt;
	
	public User getUserDetails(String username) {
		
		User user= rt.getForObject("https://api.github.com/users/"+username, User.class);
		return user;
	}
	
}
