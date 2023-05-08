package com.allane.challenge.leasecontract.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allane.challenge.leasecontract.model.LeasingContract;

@Repository
public interface LeasingDao extends JpaRepository<LeasingContract, Integer> {

}
