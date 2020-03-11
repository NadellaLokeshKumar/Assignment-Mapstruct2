package com.ito.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

	@Mapping(source = "vehicle.vehicleId", target = "vehicleId")
	@Mapping(source = "vehicle.vehicleModel", target = "vehicleModel")
	@Mapping(source = "vehicle.fuelCapacity", target = "fuelCapacity")
	@Mapping(source = "vehicle.location.locationId", target = "locationId")
	@Mapping(source = "vehicle.location.locationName", target = "locationName")
	VehicleDTO vehicleToVehicleDTO(Vehicle vehicle);

	@Mapping(source = "vehicleDTO.vehicleId", target = "vehicleId")
	@Mapping(source = "vehicleDTO.vehicleModel", target = "vehicleModel")
	@Mapping(source = "vehicleDTO.fuelCapacity", target = "fuelCapacity")
	@Mapping(source = "vehicleDTO.locationId", target = "location.locationId")
	@Mapping(source = "vehicleDTO.locationName", target = "location.locationName")
	Vehicle vehicleDTOToVehicle(VehicleDTO vehicleDTO);
}
