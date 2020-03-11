package com.ito.mapstruct.service;

import java.util.List;

import com.ito.mapstruct.dto.LocationDTO;

public interface LocationService {

	public int save(LocationDTO locationDTO);

	public LocationDTO retreiveLocationDTO(int locationId);

	public List<LocationDTO> retreiveAllLocationDTO();
}
