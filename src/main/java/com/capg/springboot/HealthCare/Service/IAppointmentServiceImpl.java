package com.capg.springboot.HealthCare.Service;

import java.util.List;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
import com.capg.springboot.HealthCare.Repository.AppointmentRepository;



@Service
@Transactional
public class IAppointmentServiceImpl implements IAppointmentService {
	
	@Autowired 
	AppointmentRepository appointment_Repo ;
	public Appointment addAppointment(Appointment appointment) throws AppointmentNotFoundException{
		return  appointment_Repo.save(appointment);
		}           


	
	@Override
	public Appointment viewAppointment(int appointmentId) throws AppointmentNotFoundException {
		Appointment appointment = appointment_Repo.findById(appointmentId);
		return appointment;
		}         

	@Override
	public Appointment updateAppointment(Appointment appointment) throws AppointmentNotFoundException {
		return appointment_Repo.save(appointment);
		}          


	
	@Override
	public Appointment removeAppointment(Appointment appointment) throws AppointmentNotFoundException {
		 appointment_Repo.delete(appointment);
		return appointment;
		
		}          
}