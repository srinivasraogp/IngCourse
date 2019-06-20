package com.hcl.ingit.entiry;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@JsonProperty
	private long studentId;
@JsonProperty
	private String firstName;
@JsonProperty
	private String lastName;
@JsonProperty
	private String gender;
@JsonProperty
	private String city;
@JsonProperty
	private String email;
@JsonProperty
	private long contactNo ;
@JsonProperty
	private long courseId;
@JsonProperty
private String courseName;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public long getStudentId() {
	return studentId;
}
public void setStudentId(long studentId) {
	this.studentId = studentId;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public RegistrationRequestDTO() {
	super();
}

public RegistrationRequestDTO(long studentId, String firstName, String lastName, String gender, String city,
		String email, long contactNo, long courseId, String courseName) {
	super();
	this.studentId = studentId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.city = city;
	this.email = email;
	this.contactNo = contactNo;
	this.courseId = courseId;
	this.courseName = courseName;
}
public long getCourseId() {
	return courseId;
}
public void setCourseId(long courseId) {
	this.courseId = courseId;
}


}
