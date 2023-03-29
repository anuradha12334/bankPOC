package com.xoriant.bank.service;

import com.xoriant.bank.model.Customer;

public interface CustomerService {
	Customer addCustomer(Customer customer);
	Customer getCustomerById(int customerId);
	Customer updateCustomer(Customer customer);
	boolean deleteCustomer(int customerId);
}