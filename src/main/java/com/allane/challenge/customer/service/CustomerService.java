package com.allane.challenge.customer.service;

import org.springframework.http.ResponseEntity;

import com.allane.challenge.customer.dto.CustomerDTO;
import com.allane.challenge.customer.model.Customer;

public interface CustomerService {

	public Customer createCustomer(CustomerDTO customerDTO);
	
	public ResponseEntity<Customer> editCustomer(int id, CustomerDTO customer);
}
