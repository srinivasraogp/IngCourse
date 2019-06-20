package com.hcl.ingit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.repository.SummaryRepository;
@Service
public class SummaryServiceImp implements SummaryService {

	@Autowired
	private SummaryRepository summaryRepository;
	@Override
	public Registration summaryDetails(Long studentId) {
		return summaryRepository.findByStudentId(studentId);
	 
		

	}

}
