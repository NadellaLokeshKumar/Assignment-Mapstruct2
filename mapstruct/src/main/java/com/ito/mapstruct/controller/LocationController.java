package com.ito.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ito.mapstruct.dto.LocationDTO;
import com.ito.mapstruct.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	public LocationService locationService;

	@PostMapping(path = "/addLocationDto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String save(@RequestBody LocationDTO locationDTO) {
		int locationId = locationService.save(locationDTO);
		return "Successfully Added, LocationId : " + locationId;
	}

	@GetMapping(path = "/retreiveLocationDto/{locationId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LocationDTO retreiveVehicleDTO(@PathVariable("locationId") int locationId) {
		LocationDTO locationDTO = locationService.retreiveLocationDTO(locationId);
		return locationDTO;
	}

	@GetMapping(path = "/retreiveAllLocationDto", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LocationDTO> retreiveAllVehicleDTO() {
		List<LocationDTO> locationDTOList = locationService.retreiveAllLocationDTO();
		return locationDTOList;
	}

}
