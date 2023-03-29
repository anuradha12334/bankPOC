package com.xoriant.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.model.Account;
import com.xoriant.bank.model.AccountDTO;
import com.xoriant.bank.model.TransactionDTO;
import com.xoriant.bank.repository.AccountRepository;


@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repository;
	
	@Override
	public Account addAccount(Account account) {
		return repository.save(account);
	}
	@Override
	public Account getAccountByNo(int accountNo) {
		return repository.getByAccountNo(accountNo);
	}


	@Override
	public Account updateAccount(Account account) {
		return repository.save(account);
	}


	@Override
	public boolean deleteAccount(int accountNo) {
		repository.deleteById(accountNo);
		return true;
	}

	@Override
	public double getBalance(int accountNo) {
		Account acc= repository.getBalanceByAccountNo(accountNo);
		return acc.getBalance();
	}

	@Override
	public AccountDTO getAccountDTO(int accountNo) {
		return repository.getAccountDetails(accountNo);
	}

	@Override
	public AccountDTO updateBalance(TransactionDTO transactionDTO) {
		Account account = getAccountByNo(transactionDTO.getAccountNo());
		account.setBalance(transactionDTO.getAmount()+account.getBalance());
		repository.save(account);		
		return getAccountDTO(transactionDTO.getAccountNo());
	}

	}
