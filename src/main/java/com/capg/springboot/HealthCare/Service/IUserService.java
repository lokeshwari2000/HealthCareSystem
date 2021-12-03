package com.capg.springboot.HealthCare.Service;



import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Admin;



@Service
public interface IUserService {
	
	
	
	public Admin addUser(Admin user);
	
	public Admin removeUser(Admin user);
	

}
