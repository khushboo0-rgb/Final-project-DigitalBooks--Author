package com.author.authentication;

public class LogInRequest {
	
	private String email;
	private String passWord;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "SignInRequest [email=" + email + ", passWord=" + passWord + "]";
	}
	
	
}