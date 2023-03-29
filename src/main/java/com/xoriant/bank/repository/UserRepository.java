package com.xoriant.bank.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.bank.model.LoginDTO;
import com.xoriant.bank.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select new com.xoriant.bank.model.LoginDTO(u.userId,u.password) from User u where u.userId = ?1 and u.password = ?2")
	LoginDTO getLogin(int userId,String password);
	
    User getByUserId(int userId);
	
	@Transactional
	@Modifying
	@Query("update User u set u.password = ?3 where u.userId = ?1 and u.password = ?2")
	int updatePasswordByuserId(int userId,String oldPassword,String newPassword);
	
	@Transactional
	@Modifying
	@Query("update User u set u.password = ?3 where u.userId = ?1 and u.email = ?2")
	int updatePasswordByEmail(int userId,String email,String newPassword);

	
}
