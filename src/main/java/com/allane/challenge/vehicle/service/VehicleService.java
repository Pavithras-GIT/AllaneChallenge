package com.allane.challenge.vehicle.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.allane.challenge.vehicle.model.Vehicle;

@Service
public class VehicleService implements VehicleServiceImpl {
	
	@Autowired
	VehicleDAO vehicleDao;

	@Override
	public ResponseEntity<Vehicle> createVehicle(Vehicle vehicle) {
		return new ResponseEntity<>(vehicleDao.save(vehicle), HttpStatus.OK);
	}

	public ResponseEntity<Vehicle> updateVehicle(int id, Vehicle vehicle) {
		 Optional<Vehicle> vehicleData = vehicleDao.findById(id);
		 if (vehicleData.isPresent()) {
		      Vehicle retrivedVehicle = vehicleData.get();
		      retrivedVehicle.setBrand(vehicle.getBrand());
		      retrivedVehicle.setModel(vehicle.getModel());
		      retrivedVehicle.setModelYear(vehicle.getModelYear());
		      retrivedVehicle.setPrice(vehicle.getPrice());
		      retrivedVehicle.setVin(vehicle.getVin());
		      return new ResponseEntity<>(vehicleDao.save(retrivedVehicle), HttpStatus.OK);
		    } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		  }
}
