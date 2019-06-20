package com.hcl.ingit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingit.entiry.RegistrationRequestDTO;
import com.hcl.ingit.entiry.RegistrationResponseDTO;
import com.hcl.ingit.service.RegistrationServiceIntf;



@RestController
@RequestMapping("/ingit")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class RegistrationController {
	@Autowired
	RegistrationServiceIntf registrationServiceIntf;
	
	@PostMapping("/registration")
	public ResponseEntity<RegistrationResponseDTO> registerStudent (@RequestBody RegistrationRequestDTO registrationRequestDto){
		
		RegistrationResponseDTO registrationResponseDto = registrationServiceIntf.registerUser(registrationRequestDto);
		return new ResponseEntity<>(registrationResponseDto, HttpStatus.CREATED);
		
		
	}

}
