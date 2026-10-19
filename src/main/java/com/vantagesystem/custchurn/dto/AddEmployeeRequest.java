package com.vantagesystem.custchurn.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddEmployeeRequest {
	
	@NotBlank
	private String clientIdentifier;
	
	@NotBlank
	private String employeeId;

}
