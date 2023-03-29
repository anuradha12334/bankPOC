package com.xoriant.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.bank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public Customer getByUserId(int customerId);
}