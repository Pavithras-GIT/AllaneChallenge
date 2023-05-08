package com.allane.challenge.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.allane.challenge.customer.dao.CustomerDAO;
import com.allane.challenge.customer.dto.CustomerDTO;
import com.allane.challenge.customer.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDao;

	public Customer createCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		Customer customer = convertCustomerDTOtoModel(customerDTO);
		return customerDao.save(customer);
	}
	
	public Customer convertCustomerDTOtoModel(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setBirthDate(customerDTO.getBirthDate());
		customer.setFirstName(customerDTO.getFirstName());
		customer.setLastName(customerDTO.getLastName());
		return customer;
	}

	public ResponseEntity<Customer> editCustomer(int id, CustomerDTO customerDTO) {
		 Optional<Customer> customerData = customerDao.findById(id);
		 if (customerData.isPresent()) {
		      Customer retrivedCustomer = customerData.get();
		      retrivedCustomer.setFirstName(customerDTO.getFirstName());
		      retrivedCustomer.setLastName(customerDTO.getLastName());
		      retrivedCustomer.setBirthDate(customerDTO.getBirthDate());
		      return new ResponseEntity<>(customerDao.save(retrivedCustomer), HttpStatus.OK);
		    } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		  }
}
