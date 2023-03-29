package com.xoriant.bank.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.xoriant.bank.model.MLoginDTO;
import com.xoriant.bank.model.Manager;
import com.xoriant.bank.model.User;
import com.xoriant.bank.service.ManagerService;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/api/v1/manager/")
public class ManagerResource {
	
	@Autowired
	private ManagerService managerService;
	
	@GetMapping("/")
	public List<Manager> getManagers(){
		return managerService.getManagers();
	}
	
	
	@PostMapping(value="/mlogin", consumes = "application/json")
	public MLoginDTO getLogin(@RequestBody MLoginDTO mloginDTO){
		return managerService.getMLogin(mloginDTO);

}
}