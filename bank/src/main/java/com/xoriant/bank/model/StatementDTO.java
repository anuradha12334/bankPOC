package com.xoriant.bank.model;

import java.util.Date;

import lombok.Data;

@Data
public class StatementDTO {
	private int accountNo;
	private Date fromDate;
	private Date toDate;
	private double lowerLimit;
	private int noOfTransactions;

}