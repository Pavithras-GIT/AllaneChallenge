package com.allane.challenge.vehicle.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allane.challenge.vehicle.model.Vehicle;

public interface VehicleDAO extends JpaRepository<Vehicle, Integer> {

}
