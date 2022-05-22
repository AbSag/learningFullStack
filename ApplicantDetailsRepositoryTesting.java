package com.reg.app;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.repositories.ApplicantDetailsRepositoryImpl;

@SpringBootTest
public class ApplicantDetailsRepositoryTesting {

	@Autowired
	ApplicantDetailsRepositoryImpl bankAppliantRepo;
	
	
	@Test
	public void insertApplicantDetails() {
		
	}
	
	@Test
	public void getAllApplicant() {
		List<ApplicantDetails> appDetails=bankAppliantRepo.getAllApplicant();
		
		for(ApplicantDetails applicantDetails: appDetails) {
			
			System.out.println("appId"+ applicantDetails.getAppId());
			System.out.println("AppType"+ applicantDetails.getAppId());
			System.out.println("title"+ applicantDetails.getAppId());
			System.out.println("firstName"+ applicantDetails.getAppId());
			System.out.println("middleName"+ applicantDetails.getAppId());
			
			System.out.println("lastName"+ applicantDetails.getAppId());
			System.out.println("dob"+ applicantDetails.getAppId());
			System.out.println("gender"+ applicantDetails.getAppId());
			System.out.println("maritalStatus"+ applicantDetails.getAppId());
			System.out.println("religion"+ applicantDetails.getAppId());
			
			System.out.println("fatherName"+ applicantDetails.getAppId());
			System.out.println("motherName"+ applicantDetails.getAppId());
			System.out.println("spouseName"+ applicantDetails.getAppId());
			System.out.println("idType"+ applicantDetails.getAppId());
			System.out.println("idNumber"+ applicantDetails.getAppId());
			
			System.out.println("panCard"+ applicantDetails.getAppId());
			System.out.println("mobile"+ applicantDetails.getAppId());
			System.out.println("email"+ applicantDetails.getAppId());
			System.out.println("address"+ applicantDetails.getAppId());
			System.out.println("nomineeName"+ applicantDetails.getAppId());
			
			System.out.println("nomineeRelationship"+ applicantDetails.getAppId());
			System.out.println("nomineeDob"+ applicantDetails.getAppId());
			System.out.println("nomineeAddress"+ applicantDetails.getAppId());
			System.out.println("guardianName"+ applicantDetails.getAppId());
			System.out.println("guardianAddress"+ applicantDetails.getAppId());
			
			System.out.println("eduQualification"+ applicantDetails.getAppId());
			System.out.println("occType"+ applicantDetails.getAppId());
			System.out.println("annualIncome"+ applicantDetails.getAppId());
			
		}
	}
}
