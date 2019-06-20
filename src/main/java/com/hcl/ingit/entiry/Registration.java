package com.hcl.ingit.entiry;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Registration implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private long studentId;	
	private long courseId;
	private String courseName;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Registration(Long id, long studentId, String firstName, String lastName, String gender, String city,
			String email, long contactNo, long courseId, String courseName) {
		super();
		this.id = id;
		this.studentId = studentId;
		
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Registration() {
		super();
	}

}