package com.xoriant.bank.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.bank.model.MLoginDTO;
import com.xoriant.bank.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
	
	@Query("select new com.xoriant.bank.model.MLoginDTO(m.managerId,m.mpassword) from Manager m where m.managerId = ?1 and m.mpassword = ?2")
	MLoginDTO getMLogin(int managerId,String mpassword);


}
