package com.hcl.ingit.testcontroller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.hcl.ingit.controller.CourseController;
import com.hcl.ingit.dto.CourseDto;
import com.hcl.ingit.service.CourseServiceImpl;


@RunWith(SpringRunner.class)
@WebMvcTest(value=CourseController.class)
public class CourseControllerTest {
	
	@Autowired 
	MockMvc mockMvc;

	@MockBean
	CourseServiceImpl courseServiceImpl;
	
	@Test
	public void courseListTest() throws Exception{
		CourseDto courseDto = new CourseDto();
		List<CourseDto> courseDtos = new ArrayList<>();
		courseDtos.add(courseDto);
		
		Mockito.when(courseServiceImpl.courseList()).thenReturn(courseDtos);
		
		mockMvc.perform(
				MockMvcRequestBuilders.get("/ingit/courses")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				;
		Mockito.verify(courseServiceImpl, Mockito.times(1)).courseList();
	}

}
