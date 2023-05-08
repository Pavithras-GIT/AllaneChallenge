package com.allane.challenge.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allane.challenge.customer.model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
