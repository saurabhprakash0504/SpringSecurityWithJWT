package com.example.demo.payload.request;

import java.util.List;
import java.util.Set;

public class SignupRequest {
	
	private String username;
	
	private String password;
	
	private String email;
	
	private Set<String> role;

	public String getUsername() {
		return username;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


}
