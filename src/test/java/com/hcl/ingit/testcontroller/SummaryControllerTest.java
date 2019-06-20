package com.hcl.ingit.testcontroller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingit.controller.SummaryController;
import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.service.SummaryService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=SummaryController.class)
public class SummaryControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private SummaryService summaryService;
	
	@Test
	public void getSummary() throws Exception{
		Registration mockRegistration=new Registration();
		mockRegistration.setCourseId(123);
		mockRegistration.setCourseName("JAVA");
		mockRegistration.setId(1L);
		mockRegistration.setStudentId(123);
		
		Mockito.when(summaryService.summaryDetails(Mockito.anyLong())).thenReturn(mockRegistration);
		
		String URI="/ingit/summary/123";
		RequestBuilder requestBuilder=MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(requestBuilder).andReturn();
		String outputInJson=result.getResponse().getContentAsString();
		String inputInJson=this.mapToJson(mockRegistration);
		Assert.assertEquals(outputInJson, inputInJson);
		
	}
	
	private String mapToJson(Object object) throws JsonProcessingException
	{
		ObjectMapper objectMapper=new ObjectMapper();
		return objectMapper.writeValueAsString(object);
	}

}
