package com.hcl.ingit.dto;

import java.io.Serializable;

public class RegistrationResDTO implements Serializable{
	
	private String firstName;
	private String lastName;
	private String courseName;
	private String courseDuration;
	private Double fee;
	private String registrationStatus;
	private String loginStatus;
	public RegistrationResDTO() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public RegistrationResDTO(String firstName, String lastName, String courseName, String courseDuration, Double fee,
			String registrationStatus, String loginStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.fee = fee;
		this.registrationStatus = registrationStatus;
		this.loginStatus = loginStatus;
	}
}
