package com.capg.springboot.HealthCare.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Login;
import com.capg.springboot.HealthCare.Repository.HealthCareException;



@Service //Performing service task

//IPatientServide interface
public interface IPatientService {
	
	//Abstract methods defined to perform CURD operation
	
	public Login registerPatient(Login patient) throws HealthCareException;
	
	public Login updatePatientDetails(Login patient) throws HealthCareException;
	
	

	
}
