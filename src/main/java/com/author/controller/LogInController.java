package com.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.authentication.LogInRequest;
import com.author.model.AuthUser;
import com.author.service.LogInServiceImp;



@RestController
@RequestMapping("/digitalbooks/author")
@CrossOrigin(origins = "http://localhost:4200")
public class LogInController {
	
	@Autowired
	private LogInServiceImp logInService;

	@PostMapping("/login")
	public ResponseEntity<?> authenticationCheck(@RequestBody LogInRequest logInRequest){
		return ResponseEntity.ok(logInService.checkUser(logInRequest));
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> createUser(@RequestBody AuthUser user){
		return new ResponseEntity<>(logInService.createUser(user),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/checkDuplicate")
	public ResponseEntity<?> checkDuplicateUser(@RequestBody AuthUser user){
		return ResponseEntity.ok(logInService.ifExistsUser(user));
	}
	
	
}