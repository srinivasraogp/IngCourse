package com.hcl.ingit.testservice;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingit.dto.CourseDto;
import com.hcl.ingit.entiry.Course;
import com.hcl.ingit.repository.CourseRepository;
import com.hcl.ingit.service.CourseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {
	@InjectMocks
	CourseServiceImpl courseServiceImpl;
	@Mock
	CourseRepository courseRepository;
	
	@Test
	public void courseListTest(){
		List<Course> courses = new ArrayList<>();
		Course course = new Course();
		courses.add(course);
		when(courseRepository.findAll()).thenReturn(courses);
		List<CourseDto> courseDtos = courseServiceImpl.courseList();
		Assert.assertEquals(courses.size(), courseDtos.size());
	}

}
