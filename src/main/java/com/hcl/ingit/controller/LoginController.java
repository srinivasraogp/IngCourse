package com.hcl.ingit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingit.dto.LoginResDTO;
import com.hcl.ingit.service.LoginService;




@RestController
@RequestMapping("/ingit")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class LoginController {
	@Autowired
	private LoginService logService;
	
	@GetMapping("/login/{studentId}")
	public ResponseEntity<LoginResDTO> validateLogin(@PathVariable Long studentId) {
		
		LoginResDTO summaryDetails = logService.validateLogin(studentId);

		return new ResponseEntity<>(summaryDetails, HttpStatus.OK);
	}

}
