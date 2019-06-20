package com.hcl.ingit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingit.dto.LoginResDTO;
import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.entiry.Student;
import com.hcl.ingit.repository.RegistrationRepository;
import com.hcl.ingit.repository.StudentRepository;

@Service
public class LoginServiceIml  implements LoginService{

	@Autowired
	private StudentRepository logRepo;
	
	@Autowired
	private RegistrationRepository regRepo;
	
	@Override
	public LoginResDTO validateLogin(Long studentId) {
		LoginResDTO loginRes = new LoginResDTO();
		loginRes.setLoginStatus("login not success");
		loginRes.setRegStatus("registration not success");
		Student student = (Student) logRepo.findByStudentId(studentId);
		if(student != null ) {
			loginRes.setLoginStatus("login success");
			Registration reg = (Registration) regRepo.findByStudentId(studentId);
			 if(reg != null) {
				 loginRes.setRegStatus("registration success");
				 BeanUtils.copyProperties(reg, loginRes);
			 }
		}
		
		
		return loginRes;
	}

}
