package com.hcl.ingit.testservice;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingit.dto.LoginResDTO;
import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.entiry.Student;
import com.hcl.ingit.repository.RegistrationRepository;
import com.hcl.ingit.repository.StudentRepository;
import com.hcl.ingit.service.LoginServiceIml;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {
	
	@InjectMocks
	LoginServiceIml loginServiceIml;
	@Mock
	RegistrationRepository registrationRepository;
	@Mock
	StudentRepository studentRepository;
	
	@Test
	public void validateLoginTest()
	{
		LoginResDTO loginRes = new LoginResDTO();
		Student student=new Student();
		student.setStudentId(1L);
		when(studentRepository.findByStudentId(1L)).thenReturn(student);
			if(student != null ) {
			Registration registration=new Registration();
			 registration.setStudentId(1L);
			when(registrationRepository.findByStudentId(1L)).thenReturn(registration);
			if(registration != null) {
				  BeanUtils.copyProperties(registration, loginRes);
				 loginRes=loginServiceIml.validateLogin(1L);
				 Assert.assertEquals(registration.getFirstName(), student.getFirstName());
			 }
						 Assert.assertNotEquals(registration,null);
					}
		     Assert.assertNotEquals(student,null);
	}
	

}
