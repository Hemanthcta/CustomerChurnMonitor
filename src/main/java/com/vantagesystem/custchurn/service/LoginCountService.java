package com.vantagesystem.custchurn.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.vantagesystem.custchurn.dto.UpdateLoginCountRequest;
import com.vantagesystem.custchurn.dto.UpdateLoginCountResponse;
import com.vantagesystem.custchurn.repository.EmployeeDetailsRepository;

@Service
public class LoginCountService {

private final EmployeeDetailsRepository empRepo;
	
	public LoginCountService(EmployeeDetailsRepository empRepo)
	{
		this.empRepo = empRepo;
	}
	
	@Async
	public void updateLoginCount(UpdateLoginCountRequest request)
	{
		UpdateLoginCountResponse updateLoginCountResponse = null;
		try {
		empRepo.updateLoginCount(request.getClientIdentifier(), request.getEmployeeId(), request.getLoginDateTime());
		}catch(Exception e)
		{
			//Add logger
			
		}
		// Add Logger
	}
	
	

}
