package com.xoriant.bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int accountNo;
	private AccountType accounttype;
	private double balance;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

}