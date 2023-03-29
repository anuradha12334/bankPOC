package com.xoriant.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.bank.model.Account;
import com.xoriant.bank.model.AccountDTO;


public interface AccountRepository extends JpaRepository<Account, Integer>{

	@Query("select a from Account a where a.accountNo = ?1")
	public Account getByAccountNo(int accountNo);
	
	@Query("select a from Account a where a.accountNo = ?1")
	public Account getBalanceByAccountNo(int accountNo);
	
	@Query("select new com.xoriant.bank.model.AccountDTO(a.accountNo,a.balance,a.customer.name,a.customer.userId,a.accounttype) from Account a where a.accountNo=?1")
	AccountDTO getAccountDetails(int accountNo);

	

}