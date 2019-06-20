package com.hcl.ingit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingit.dto.CourseDto;
import com.hcl.ingit.service.CourseServiceImpl;


@RestController
@RequestMapping(value="/ingit")

@CrossOrigin(allowedHeaders={"*", "*/"}, origins={"*", "*/"})
public class CourseController {
	
	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@GetMapping(value="/courses")
	public ResponseEntity<List<CourseDto>> courseList() 
	{
		List<CourseDto> courses=courseServiceImpl.courseList();
		
		return new ResponseEntity<>(courses, HttpStatus.OK);
		
	}

}
