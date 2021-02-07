package com.ivandeclei.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivandeclei.workshopmongo.domain.User;
import com.ivandeclei.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;  //injecao de dependencia automatica

	public List<User> findAll(){
		return repo.findAll();
	}
}
