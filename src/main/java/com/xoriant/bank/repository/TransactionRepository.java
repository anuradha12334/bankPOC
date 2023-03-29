package com.xoriant.bank.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.bank.model.Customer;
import com.xoriant.bank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
	Transaction getByTransactionId(int transactionId);
	
	@Query(nativeQuery = true,value="select * from Transaction t where primary_account = ?1 order by date desc limit 10")
	List<Transaction> getMiniStatement(int accountNo);
	
	@Query(nativeQuery = true,value="select * from Transaction t where primary_account = ?1 and date >= ?2 and date <= ?3 and abs(amount) >= ?4  order by date desc limit ?5")
	List<Transaction> getCustomisedStatement(int accountNo,Date fromDate,Date toDate,double lowerLimit,int noOfTransactions);


}