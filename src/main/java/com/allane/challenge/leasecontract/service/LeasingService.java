package com.allane.challenge.leasecontract.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.allane.challenge.leasecontract.model.LeasingContract;

public interface LeasingService {

	ResponseEntity<LeasingContract> createContract(LeasingContract contract);

	ResponseEntity<LeasingContract> updateContract(int id, LeasingContract contract);

	ResponseEntity<List<LeasingContract>> viewContracts();

}
