package com.xoriant.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.model.StatementDTO;
import com.xoriant.bank.model.Transaction;
import com.xoriant.bank.repository.TransactionRepository;


@Service
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	private TransactionRepository repository;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		return repository.save(transaction);
	}

	@Override
	public Transaction getTransactionById(int transactionId) {
		return repository.getByTransactionId(transactionId);
	}

	@Override
	public List<Transaction> getMiniStatement(int accountNo) {
		return repository.getMiniStatement(accountNo);
	}

	@Override
	public List<Transaction> getCustomisedStatement(StatementDTO statementDTO) {
		return repository.getCustomisedStatement(statementDTO.getAccountNo(),statementDTO.getFromDate(),statementDTO.getToDate(),statementDTO.getLowerLimit(),statementDTO.getNoOfTransactions());
	}


}