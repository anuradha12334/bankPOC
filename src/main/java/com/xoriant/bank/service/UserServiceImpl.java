package com.xoriant.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.model.LoginDTO;
import com.xoriant.bank.model.User;
import com.xoriant.bank.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> getUsers(){
		return repository.findAll();
	}
	
	@Override
	public LoginDTO getLogin(LoginDTO loginDTO) {
		System.out.println(repository.getLogin(loginDTO.getUserId(), loginDTO.getPassword()));
		return repository.getLogin(loginDTO.getUserId(), loginDTO.getPassword());
	}


	@Override
	public User getUserById(int userId) {
		return repository.getByUserId(userId);
	}

	@Override
	public int updatePasswordByuserId(int userId,String oldPassword,String newPassword) {
		return repository.updatePasswordByuserId(userId, oldPassword, newPassword);
	}

	@Override
	public int updatePasswordByEmail(int userId, String email, String newPassword) {
		return repository.updatePasswordByEmail(userId,email,newPassword);
	}
}
