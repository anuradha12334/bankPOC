package com.xoriant.bank.service;

import com.xoriant.bank.model.Account;
import com.xoriant.bank.model.AccountDTO;
import com.xoriant.bank.model.TransactionDTO;

public interface AccountService {
	
	Account addAccount(Account account);
	Account updateAccount(Account account);
	Account getAccountByNo(int accountNo);
	boolean deleteAccount(int accountNo);
	double getBalance(int accountNo);
	AccountDTO getAccountDTO(int accountNo);
	AccountDTO updateBalance(TransactionDTO transactionDTO);
	
	
}