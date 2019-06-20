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

public RegistrationRequestDTO() {
	super();
}

public RegistrationRequestDTO(long studentId,  long courseId, String courseName) {
	super();
	this.studentId = studentId;
	
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
