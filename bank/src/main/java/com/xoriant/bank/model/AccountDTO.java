package com.xoriant.bank.model;

import lombok.Data;

@Data
public class AccountDTO {
	private int accountNo;
	private double balance;
	private String name;
	private int userId;
	private AccountType type;
	
	public AccountDTO(int accountNo, double balance, String name, int userId, AccountType type) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		this.userId = userId;
		this.type = type;
	}
}