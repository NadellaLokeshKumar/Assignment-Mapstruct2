package com.ito.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapstruct.dto.VehicleDTO;
import com.ito.mapstruct.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	public VehicleService vehicleService;

	@PostMapping(path = "/addVehicleDto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody VehicleDTO vehilceDto) {
		int vehicleId = vehicleService.save(vehilceDto);
		return "succesfully added, Vehicle Id :" + vehicleId;
	}

	@GetMapping(path = "/retreiveVehicleDto/{vehicleId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public VehicleDTO retreiveVehicleDTO(@PathVariable("vehicleId") int vehicleId) {
		VehicleDTO vehicleDTO = vehicleService.retreiveVehcileDTO(vehicleId);
		return vehicleDTO;
	}

	@GetMapping(path = "/retreiveAllVehicleDto", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VehicleDTO> retreiveAllVehicleDTO() {
		List<VehicleDTO> vehicleDTOList = vehicleService.retreiveAllVehicleDTO();
		return vehicleDTOList;
	}

}
