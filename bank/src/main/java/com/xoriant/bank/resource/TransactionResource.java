package com.xoriant.bank.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.bank.model.StatementDTO;
import com.xoriant.bank.model.Transaction;
import com.xoriant.bank.service.TransactionService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/transaction")
public class TransactionResource {
	
	@Autowired
	private TransactionService service;
	
	@GetMapping(value="/{transactionId}")
	public Transaction getTransactionById(@PathVariable int transactionId) {
		return service.getTransactionById(transactionId);
	}
	@PostMapping(value="/",consumes="application/json")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		return service.addTransaction(transaction);
	}
	@GetMapping(value="/ministatement/{accountNo}")
	public List<Transaction> getMiniStatement(@PathVariable int accountNo){
		return service.getMiniStatement(accountNo);
	}
	@PostMapping(value="/customstatement/",consumes="application/json")
	public List<Transaction> getCustomStatement(@RequestBody StatementDTO statementDTO){
		return service.getCustomisedStatement(statementDTO);
	}
}