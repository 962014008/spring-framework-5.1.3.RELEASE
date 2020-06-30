package com.lzt.spring.bean;

import org.springframework.stereotype.Service;

@Service
public class Teacher {

	private String username = "teacher";

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
