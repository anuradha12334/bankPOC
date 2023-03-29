package com.xoriant.bank.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.model.Customer;
import com.xoriant.bank.service.CustomerService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/customer")
public class CustomerResource {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping(value="/", consumes = "application/json")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	@GetMapping(value="/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		return service.getCustomerById(customerId);
	}
	@PutMapping(value="/", consumes="application/json")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}
	@DeleteMapping(value="/{customerId}")
	public boolean deleteCustomer(@PathVariable int customerId) {
		return service.deleteCustomer(customerId);
	}
}