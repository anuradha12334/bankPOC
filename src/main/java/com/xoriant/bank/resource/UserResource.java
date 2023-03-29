package com.xoriant.bank.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.model.LoginDTO;
import com.xoriant.bank.model.User;
import com.xoriant.bank.service.UserService;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api/v1/user/")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@PostMapping(value="/login", consumes = "application/json")
	public LoginDTO getLogin(@RequestBody LoginDTO loginDTO){
		return userService.getLogin(loginDTO);
	}
	@GetMapping(value="/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserById(userId);
	}
	
	@PutMapping(value="/{userId}/{oldPassword}/{newPassword}", consumes = "application/json")
	public int updatePasswordByuserId(@PathVariable int userId, @PathVariable String oldPassword, @PathVariable String newPassword) {
		return userService.updatePasswordByuserId(userId, oldPassword, newPassword);
	}
	
	@PutMapping(value="/forgot/{userId}/{email}/{newPassword}", consumes = "application/json")
	public int updatePasswordByEmail(@PathVariable int userId, @PathVariable String email, @PathVariable String newPassword) {
		return userService.updatePasswordByEmail(userId, email, newPassword);
	}
}
