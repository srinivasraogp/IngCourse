package com.hcl.ingit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.service.SummaryService;

@RestController
@RequestMapping("/")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class SummaryController {
	@Autowired
	private SummaryService summaryService;

@GetMapping("/ingit/summary/{studentId}")
public ResponseEntity<Registration> getSummary(@PathVariable Long studentId) {
	Registration registratonResDto = summaryService.summaryDetails(studentId);
	return new ResponseEntity<>(registratonResDto, HttpStatus.OK);
}
}