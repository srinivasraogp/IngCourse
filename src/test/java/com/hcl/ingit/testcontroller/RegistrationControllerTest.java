package com.hcl.ingit.testcontroller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.ingit.controller.RegistrationController;
import com.hcl.ingit.entiry.RegistrationRequestDTO;
import com.hcl.ingit.entiry.RegistrationResponseDTO;
import com.hcl.ingit.service.RegistrationServiceIntf;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RegistrationController.class)

public class RegistrationControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	@Autowired
	private RegistrationServiceIntf registrationServiceIntf;
	@Test
	public void registerStudentTest() throws Exception {
		RegistrationRequestDTO registrationReqDto = new RegistrationRequestDTO();
		registrationReqDto.setStudentId(1234);
	
		registrationReqDto.setCourseName("Java");
		registrationReqDto.setCourseId(999);
		RegistrationResponseDTO registrationResDTO = new RegistrationResponseDTO();
		registrationResDTO.setStudentId(1234);
		registrationResDTO.setCourseName("Java");
		registrationResDTO.setCourseId(999);
		mockMvc.perform(post("/ingit/registration").contentType(MediaType.APPLICATION_JSON).content(asJsonString(registrationResDTO)))
				.andExpect(status().isCreated());
		
		

	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

	
	
	

