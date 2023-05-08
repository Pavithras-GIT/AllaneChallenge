package com.allane.challenge.leasecontract.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.allane.challenge.leasecontract.dao.LeasingDao;
import com.allane.challenge.leasecontract.model.LeasingContract;

@Service
public class LeasingServiceImpl implements LeasingService {

	@Autowired
	LeasingDao leasingDao;
	@Override
	public ResponseEntity<LeasingContract> createContract(LeasingContract contract) {
		
		return new ResponseEntity<>(leasingDao.save(contract), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<LeasingContract> updateContract(int id, LeasingContract contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<LeasingContract>> viewContracts() {
		// TODO Auto-generated method stub
		List<LeasingContract> contracts = leasingDao.findAll();
		   if (contracts.isEmpty()) {
			      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			    }
			    return new ResponseEntity<>(contracts, HttpStatus.OK);
	}

}
