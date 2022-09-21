package com.author.authentication;

import com.author.model.AuthUser;

public class LogInResponse {
	
	private String message;
	private String role;
	private int statusCode;
	private AuthUser user;
	
	
	public AuthUser getUser() {
		return user;
	}
	public void setUser(AuthUser user) {
		this.user = user;
	}
	public LogInResponse() {
		super();
	}
	
	public LogInResponse(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}
	public LogInResponse(String message, String role, int statusCode, AuthUser user) {
		super();
		this.message = message;
		this.role = role;
		this.statusCode = statusCode;
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	

}