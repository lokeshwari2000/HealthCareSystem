package com.capg.springboot.HealthCare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.HealthCare.Entities.Login;



// PatientRepository interface is used to call the database request related to patient

public interface IPatientRepository extends JpaRepository<Login,Long>{
	
	
}
