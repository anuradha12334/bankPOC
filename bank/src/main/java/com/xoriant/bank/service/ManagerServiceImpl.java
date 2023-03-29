package com.xoriant.bank.service;

import java.util.List;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.bank.model.MLoginDTO;
import com.xoriant.bank.model.Manager;
import com.xoriant.bank.repository.ManagerRepository;
import com.xoriant.bank.repository.UserRepository;

@Service
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerRepository repository;

	
	
	@Override
	public MLoginDTO getMLogin(MLoginDTO mloginDTO) {
	
	System.out.println(repository.getMLogin(mloginDTO.getManagerId(), mloginDTO.getMpassword()));
	return repository.getMLogin(mloginDTO.getManagerId(), mloginDTO.getMpassword());

	}



	@Override
	public List<Manager> getManagers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}


	
