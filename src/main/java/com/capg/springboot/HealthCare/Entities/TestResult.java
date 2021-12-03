package com.capg.springboot.HealthCare.Entities;

//import javax.persistence.Column;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//@Entity
//@Table(name="TestResult")
//public class TestResult {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	
//	private int TestId;
//	private double testReading;
//	private String condition;
//	@ManyToOne
//	@JoinColumn(name="id",referencedColumnName="id")
//	private Appointment appointment;
//	public TestResult() {
//		super();
//	}
//	
//	
//	
//	public TestResult(int testId, double testReading, String condition, Appointment appointment) {
//		super();
//		TestId = testId;
//		this.testReading = testReading;
//		this.condition = condition;
//		this.appointment = appointment;
//	}
//
//
//
//	public int getTestId() {
//		return TestId;
//	}
//	public void setTestId(int testId) {
//		TestId = testId;
//	}
//	public double getTestReading() {
//		return testReading;
//	}
//	public void setTestReading(double testReading) {
//		this.testReading = testReading;
//	}
//	public String getCondition() {
//		return condition;
//	}
//	public void setCondition(String condition) {
//		this.condition = condition;
//	}
//	public Appointment getAppointment() {
//		return appointment;
//	}
//	public void setAppointment(Appointment appointment) {
//		this.appointment = appointment;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "TestResult [TestId=" + TestId + ", testReading=" + testReading + ", condition=" + condition
//				+ ", appointment=" + appointment + "]";
//	}
//	
//}
//	
//	
	
