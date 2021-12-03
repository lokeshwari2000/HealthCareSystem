package com.capg.springboot.HealthCare.Controller;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.HealthCare.Entities.Appointment;
import com.capg.springboot.HealthCare.Exception.AppointmentNotFoundException;
import com.capg.springboot.HealthCare.Service.IAppointmentServiceImpl;



@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
	
	@Autowired 
	IAppointmentServiceImpl serviceobj ;
	
	
/************************************************************************************************/
    
	@PostMapping(path = "/addAppointment")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) throws AppointmentNotFoundException
	{
		if(appointment.getid()==0)
		{
			return new ResponseEntity("Invalid Id",HttpStatus.NOT_FOUND);
		}
		Appointment appointImpl = serviceobj.addAppointment(appointment);
		return new ResponseEntity(appointImpl,HttpStatus.OK);
	}
	
/**
 * @throws AppointmentNotFoundException **********************************************************************************************/
	@GetMapping(path="/viewAppointment/{appointmentId}")
	public ResponseEntity <Appointment> viewAppointment(@PathVariable("appointmentId") int appointmentId) throws AppointmentNotFoundException
	{
		Appointment appointmentImpl = serviceobj.viewAppointment(appointmentId);
		return new ResponseEntity <Appointment>(appointmentImpl,new HttpHeaders(),HttpStatus.OK);
		
	}

	
/************************************************************************************************/	
	
	
	
	
	@PutMapping(path = "/updateAppointment") 
	public ResponseEntity<Appointment> updateAppointment(@RequestBody Appointment appointment) throws AppointmentNotFoundException
	{
		if(appointment == null)
		{
			return new ResponseEntity("Enter valid product details",HttpStatus.NOT_FOUND);
		}
		Appointment appoint = serviceobj.updateAppointment(appointment);
		return new ResponseEntity(appoint,HttpStatus.OK);
	}
	
	
/************************************************************************************************/
	
	
	@DeleteMapping("/removeAppointment/{appointment}")
	public Appointment removeAppointment(@PathVariable Appointment appointment) throws AppointmentNotFoundException
	{
		Appointment appointdel = serviceobj.removeAppointment(appointment);
		return appointdel;
	}	
}

