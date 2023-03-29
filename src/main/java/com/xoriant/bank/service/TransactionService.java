package com.xoriant.bank.service;

import java.util.List;

import com.xoriant.bank.model.StatementDTO;
import com.xoriant.bank.model.Transaction;



public interface TransactionService {
	Transaction addTransaction(Transaction transaction);
	Transaction getTransactionById(int transactionId);
	List<Transaction> getMiniStatement(int accountNo);
	List<Transaction> getCustomisedStatement(StatementDTO statementDTO);
}