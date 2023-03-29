package com.xoriant.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Manager{
	
	@Id
	private int managerId;
	private String managerName;
	private String mpassword;
	

}
