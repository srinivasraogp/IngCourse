package com.hcl.ingit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingit.dto.CourseDto;
import com.hcl.ingit.entiry.Course;
import com.hcl.ingit.repository.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	CourseRepository courseRepository;
	
	public List<CourseDto> courseList() {
		List<Course> courses=courseRepository.findAll();
		List<CourseDto> courseDtos=new ArrayList<>();
		for (Course course : courses) {
			CourseDto courseDto =new CourseDto();
			BeanUtils.copyProperties(course, courseDto);
			courseDtos.add(courseDto);
			
		}
		
		return courseDtos;
	}

}
