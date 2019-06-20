package com.hcl.ingit.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.entiry.RegistrationRequestDTO;
import com.hcl.ingit.entiry.RegistrationResponseDTO;
import com.hcl.ingit.repository.RegistrationRepository;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationServiceIntf {
	@Autowired
	RegistrationRepository registrationRepository;
	
	
	public RegistrationResponseDTO registerStudent(RegistrationRequestDTO registrationRequestDto) {

	 {
			RegistrationResponseDTO registrationResponseDto= new RegistrationResponseDTO();
			Registration registration=new Registration();
			
			BeanUtils.copyProperties(registrationRequestDto, registration);
		
			registration = registrationRepository.save(registration);
			BeanUtils.copyProperties(registration, registrationResponseDto);
			return registrationResponseDto;
		}	
	}

}
