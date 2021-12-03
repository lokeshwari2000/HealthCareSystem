package com.capg.springboot.HealthCare.Service;

import javax.transaction.Transactional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capg.springboot.HealthCare.Entities.Login;
import com.capg.springboot.HealthCare.Repository.HealthCareException;
import com.capg.springboot.HealthCare.Repository.IPatientRepository;




//IPatientServide interface

@Transactional
@Service
public class IPatientServiceImpl implements IPatientService {

	@Autowired
	IPatientRepository iPatientRepository;
	
	
	@Override
	public Login registerPatient(Login patient) throws HealthCareException {
		Login patientobj=iPatientRepository.save(patient);
		return patientobj;
	}
	
	@Override
	public Login updatePatientDetails(Login patient) throws HealthCareException {
		// TODO Auto-generated method stub
		Login patientobj=iPatientRepository.save(patient);
		return patientobj;
	}
	
	
	

	
}
