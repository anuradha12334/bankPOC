package com.xoriant.bank.service;

import java.util.List;

import com.xoriant.bank.model.MLoginDTO;
import com.xoriant.bank.model.Manager;


public interface ManagerService {
	
	List<Manager> getManagers();
	MLoginDTO getMLogin(MLoginDTO mloginDTO);

}
