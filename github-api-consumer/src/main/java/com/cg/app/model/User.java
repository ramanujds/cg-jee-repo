package com.cg.app.model;

import lombok.Data;

@Data
public class User {

	private String login;
	private String name;
	private String location;
	private long public_repos;
	private String avatar_url;
	
}
