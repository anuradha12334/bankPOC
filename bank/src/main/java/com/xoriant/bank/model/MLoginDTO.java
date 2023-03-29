package com.xoriant.bank.model;

import lombok.Data;

@Data
public class MLoginDTO {
	
	private int managerId;
	private String mpassword;
	
	public MLoginDTO(int managerId, String mpassword) {
		super();
		this.managerId = managerId;
		this.mpassword = mpassword;
	}
	
}
