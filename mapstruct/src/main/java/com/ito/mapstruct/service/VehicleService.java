package com.ito.mapstruct.service;

import java.util.List;

import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;

public interface VehicleService {

	public int save(VehicleDTO vehicleDTO);
	public VehicleDTO retreiveVehcileDTO(int vehicleId);
	public List<VehicleDTO> retreiveAllVehicleDTO();
}
