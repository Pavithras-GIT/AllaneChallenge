package com.allane.challenge.vehicle.service;

import org.springframework.http.ResponseEntity;

import com.allane.challenge.vehicle.model.Vehicle;

public interface VehicleServiceImpl {

	 ResponseEntity<Vehicle> createVehicle(Vehicle vehicle);

	 ResponseEntity<Vehicle> updateVehicle(int id, Vehicle vehicle);

}
