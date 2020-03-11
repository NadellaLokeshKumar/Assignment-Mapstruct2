package com.ito.mapstruct.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ito.mapstruct.dto.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
