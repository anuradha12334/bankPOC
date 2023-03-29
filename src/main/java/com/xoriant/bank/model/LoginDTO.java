package com.xoriant.bank.model;

import lombok.Data;

@Data
public class LoginDTO {
	private int userId;
	private String password;
	
	public LoginDTO(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}


}