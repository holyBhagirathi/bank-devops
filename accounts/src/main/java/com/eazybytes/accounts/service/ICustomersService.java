package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;


public interface ICustomersService {
	
	public CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
	
	

}
