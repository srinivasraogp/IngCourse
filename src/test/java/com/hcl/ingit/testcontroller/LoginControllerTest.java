package com.hcl.ingit.testcontroller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
import com.hcl.ingit.controller.LoginController;
import com.hcl.ingit.dto.LoginResDTO;
import com.hcl.ingit.service.LoginService;



@RunWith(SpringRunner.class)
@WebMvcTest(value = LoginController.class)
public class LoginControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	@Autowired
	private LoginService logService;

	@Test
	public void validateLogin() throws Exception {
		LoginResDTO loginRes = new LoginResDTO();
		loginRes.setStudentId(1234L);
		loginRes.setCourseDuration(45);
		loginRes.setCourseName("Java");
		loginRes.setFirstName("sri");
		loginRes.setLastName("G");
		loginRes.setFee(10000.0);
		loginRes.setRegStatus("registration success");
		loginRes.setLoginStatus("login success");
		
		mockMvc.perform(get("/ingit/login/1234").contentType(MediaType.APPLICATION_JSON).content(asJsonString(loginRes)))
				.andExpect(status().isOk());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


}
