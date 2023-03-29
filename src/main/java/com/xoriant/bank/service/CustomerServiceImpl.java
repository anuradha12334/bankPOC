package com.xoriant.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.model.Customer;
import com.xoriant.bank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository repository;

	@Override
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		return repository.getByUserId(customerId);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		repository.deleteById(customerId);
		return true;
	}
	
	
}