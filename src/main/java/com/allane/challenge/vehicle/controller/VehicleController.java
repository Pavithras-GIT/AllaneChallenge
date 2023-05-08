package com.allane.challenge.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allane.challenge.vehicle.model.Vehicle;
import com.allane.challenge.vehicle.service.VehicleServiceImpl;

@RequestMapping("/vehicles")
@RestController
public class VehicleController {

	@Autowired
	private VehicleServiceImpl vehicleService;
	
	@PostMapping("/create-vehicle")
	public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle){
		return vehicleService.createVehicle(vehicle);
	}
	
	@PutMapping("/update-vehicle/{id}")
	public ResponseEntity<Vehicle> updateVehicle(@PathVariable("id") int id, @RequestBody Vehicle vehicle){
		return vehicleService.updateVehicle(id, vehicle);
	}
}
