package com.allane.challenge.leasecontract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.challenge.leasecontract.model.LeasingContract;
import com.allane.challenge.leasecontract.service.LeasingService;

@RestController
@RequestMapping("/leasing")
public class LeasingController {
	
	@Autowired
	LeasingService leasingService;
	
	@PostMapping("/create-contract")
	public ResponseEntity<LeasingContract> createContract(@RequestBody LeasingContract contract){
		return leasingService.createContract(contract);
	}
	
	@PutMapping("/update-contract/{id}")
	public ResponseEntity<LeasingContract> updateContract(@PathVariable("id") int id, @RequestBody LeasingContract contract){
		return leasingService.updateContract(id, contract);
	}
	
	@GetMapping("/view-contracts-summary")
	public ResponseEntity<List<LeasingContract>> viewContracts(){
		return leasingService.viewContracts();
	}
	
	
}
