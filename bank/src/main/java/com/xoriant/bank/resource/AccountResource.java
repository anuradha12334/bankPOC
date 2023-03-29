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

import com.xoriant.bank.model.Account;
import com.xoriant.bank.model.AccountDTO;
import com.xoriant.bank.model.TransactionDTO;
import com.xoriant.bank.service.AccountService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/account")
public class AccountResource {
	
	@Autowired
	private AccountService service;
	
	@PostMapping(value="/", consumes = "application/json")
	public Account addAccount(@RequestBody Account account) {
		return service.addAccount(account);
	}
	@GetMapping(value="/balance/{accountNo}")
	public double getBalance(@PathVariable int accountNo) {
		return service.getBalance(accountNo);
	}
	@PutMapping(value="/", consumes="application/json")
	public Account updateAccount(@RequestBody Account account) {
		return service.updateAccount(account);
	}
	@DeleteMapping(value="/{accountNo}")
	public boolean deleteAcocunt(@PathVariable int accountNo) {
		return service.deleteAccount(accountNo);
	}
	@GetMapping(value="/{accountNo}")
	public Account getAccountByNo(@PathVariable int accountNo) {
		return service.getAccountByNo(accountNo);
	}

	@PutMapping(value="/updatebalance", consumes = "application/json")
	public AccountDTO updateBalance(@RequestBody TransactionDTO transactionDTO) {
		return service.updateBalance(transactionDTO);
	}
	
	
}