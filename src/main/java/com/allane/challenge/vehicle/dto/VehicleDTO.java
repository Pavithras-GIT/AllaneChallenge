package com.allane.challenge.vehicle.dto;

import java.math.BigDecimal;
import java.time.Year;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleDTO {
	
	private String vin;
	private String brand;
	private String model;
	private Year modelYear;
	private BigDecimal price;
}
