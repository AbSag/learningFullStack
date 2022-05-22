package com.reg.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.services.ApplicantDetailsServices;

@SpringBootTest
public class ApplicantDetailsServiceTesting {

	@Autowired
	ApplicantDetailsServices appDetailsService;
	
	@Test
	public void testAllApplicantDetails() {
		appDetailsService.fetchAllApplicantsService();
	}
	
	@Test
	public void testInsertApplicantDetails(ApplicantDetails appDetails) {
		appDetailsService.addApplicantService(appDetails);
	}
	
}
