package com.xoriant.bank.model;

import lombok.Data;

@Data
public class TransactionDTO {
	private double amount;
	private int accountNo;
	public TransactionDTO(double amount, int accountNo) {
		this.amount = amount;
		this.accountNo = accountNo;
	}

}