package com.hcl.ingit.testservice;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.ingit.entiry.Registration;
import com.hcl.ingit.repository.SummaryRepository;
import com.hcl.ingit.service.SummaryServiceImp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SummaryServiceImpTest {
	
	@InjectMocks
	SummaryServiceImp summaryServiceImp;
	
	@Mock
	private SummaryRepository summaryRepository;
	
	@Test
	public void summaryDetails()
	{
		Registration  registration=new Registration();
		registration.setStudentId(1L);
		when(summaryRepository.findByStudentId(1L)).thenReturn(registration);
		Assert.assertEquals(registration, summaryServiceImp.summaryDetails(1L));
	}
	

}
