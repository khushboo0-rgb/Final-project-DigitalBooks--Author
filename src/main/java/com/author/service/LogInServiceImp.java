package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.authentication.LogInRequest;
import com.author.authentication.LogInResponse;
import com.author.model.AuthUser;

@Service
public class LogInServiceImp implements ILogInService {

	@Autowired
	private ILogInRepository logInRepo;

	@Override
	public LogInResponse checkUser(LogInRequest user) {
		try {
			AuthUser obj = logInRepo.findByEmail(user.getEmail());
			if ((obj == null)) {
				return new LogInResponse("NOT FOUND PLZ CHECK USER DETAILS", 415);
			} else if (!(user.getPassWord().equals(obj.getPassWord()))) {
				return new LogInResponse("INCORRECT PASSWORD", 415);
			} else {
				return new LogInResponse("SUCCESS", obj.getRole(), 201, obj);
			}
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
		return new LogInResponse("SOMETHING IS WRONG", 415);

	}

	@Override
	public LogInResponse createUser(AuthUser user) {
		try {
			System.out.println(user);
			AuthUser obj = logInRepo.save(user);
			AuthUser obj1=new AuthUser(obj.getUserId(),obj.getUserName(),obj.getEmail(),obj.getRole(),null);
			return new LogInResponse("USER CREATED SUCCESSFULLY", obj.getRole(), 201, obj1);
		} catch (Exception ex) {
			return new LogInResponse("SOMETHING IS WRONG", 415);
		}

	}

	@Override
	public Boolean ifExistsUser(AuthUser user) {
		boolean obj= logInRepo.existsByEmail(user.getEmail());
		return obj;
	}

}