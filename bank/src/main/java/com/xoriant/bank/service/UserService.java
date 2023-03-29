package com.xoriant.bank.service;

import java.util.List;

import com.xoriant.bank.model.LoginDTO;
import com.xoriant.bank.model.User;


public interface UserService {
	
		List<User> getUsers();
		LoginDTO getLogin(LoginDTO loginDTO);
		
		User getUserById(int userId);
		int updatePasswordByuserId(int userId,String oldPassword,String newPassword);
		int updatePasswordByEmail(int userId,String email,String newPassword);

}
