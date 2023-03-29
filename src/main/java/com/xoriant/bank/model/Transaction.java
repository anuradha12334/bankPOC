package com.xoriant.bank.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transactionId;
	@ManyToOne
	@JoinColumn(name="primary_account")
	private Account account;
	@ManyToOne
	@JoinColumn(name="secondary_account")
	private Account secondaryAccount;
	private double amount;
	private String description;
	private Date date;
}