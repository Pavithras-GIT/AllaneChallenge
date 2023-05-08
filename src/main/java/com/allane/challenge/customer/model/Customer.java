package com.allane.challenge.customer.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.allane.challenge.leasecontract.model.LeasingContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int customerId;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	
   @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
   @JsonIgnore
   private Set<LeasingContract> contracts = new HashSet<LeasingContract>();
	

}
