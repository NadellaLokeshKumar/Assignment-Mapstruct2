package com.ito.mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationDTO;

@Mapper(componentModel = "spring")
public interface LocationMapper {

	@Mapping(source = "location.locationId", target = "locationId")
	@Mapping(source = "location.locationName", target = "locationName")
	@Mapping(source = "location.address", target = "address")
	LocationDTO locationToLocationDTO(Location location);

	@Mapping(source = "locationDTO.locationId", target = "locationId")
	@Mapping(source = "locationDTO.locationName", target = "locationName")
	@Mapping(source = "locationDTO.address", target = "address")
	Location locationDTOToLocation(LocationDTO locationDTO);
}
