package com.author.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.author.model.AuthUser;


public interface ILogInRepository extends JpaRepository<AuthUser, Integer> {

	AuthUser findByEmail(String email);

	Boolean existsByEmail(String email);

}