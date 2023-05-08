package com.allane.challenge.leasecontract.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.allane.challenge.customer.model.Customer;
import com.allane.challenge.vehicle.model.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeasingContract implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "contract_number")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contractNumber;
	private BigDecimal monthlyRate;	
	
    @ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vin", referencedColumnName = "vin")
    private Vehicle vehicle;
	  
}
