package com.author.service;

import com.author.authentication.LogInRequest;
import com.author.authentication.LogInResponse;
import com.author.model.AuthUser;

public interface ILogInService {

	public LogInResponse checkUser(LogInRequest user);
	
	public LogInResponse createUser(AuthUser user);
	
	public Boolean ifExistsUser(AuthUser user);
}