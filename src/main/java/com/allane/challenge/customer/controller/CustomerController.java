package com.allane.challenge.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.challenge.customer.dto.CustomerDTO;
import com.allane.challenge.customer.model.Customer;
import com.allane.challenge.customer.service.CustomerServiceImpl;

@RequestMapping("/customers")
@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;
	
	@PostMapping("/create-customer")
	public ResponseEntity<Customer> createCustomer(@RequestBody CustomerDTO customerDTO){
		Customer customer =customerService.createCustomer(customerDTO);
		return new ResponseEntity<Customer>(customer,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/edit-customer/{id}")
	public ResponseEntity<Customer> editCustomer(@PathVariable("id") int id, @RequestBody CustomerDTO customer){
		System.out.println("dg");
		return customerService.editCustomer(id, customer);
	}
}
