package com.hcl.ingit.entiry;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationResponseDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private long studentId;
   
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

public long getCourseId() {
	return courseId;
}
public void setCourseId(long courseId) {
	this.courseId = courseId;
}


}
