package com.ito.mapstruct.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapstruct.dto.Location;
import com.ito.mapstruct.dto.LocationDTO;
import com.ito.mapstruct.mapper.LocationMapper;
import com.ito.mapstruct.repo.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	public static Logger logger = Logger.getLogger(LocationServiceImpl.class);

	@Autowired
	public LocationRepository locationRepo;

	@Autowired
	public LocationMapper locationMapper;

	@Override
	public int save(LocationDTO locationDTO) {
		logger.debug("save method started");
		int locationId = locationRepo.save(locationMapper.locationDTOToLocation(locationDTO)).getLocationId();
		logger.debug("save method ended");
		return locationId;
	}

	@Override
	public LocationDTO retreiveLocationDTO(int locationId) {
		logger.debug("retreiveLocationDTO method started");
		LocationDTO locationDTO = locationMapper.locationToLocationDTO(locationRepo.getOne(locationId));
		logger.debug(locationDTO);
		logger.debug("retreiveLocationDTO method ended");
		return locationDTO;
	}

	@Override
	public List<LocationDTO> retreiveAllLocationDTO() {
		logger.debug("retreiveAllLocationDTO method started");
		List<Location> locationList = locationRepo.findAll();
		ArrayList<LocationDTO> LocationDTOList = new ArrayList<LocationDTO>();
		Iterator itr = locationList.iterator();
		while (itr.hasNext()) {
			LocationDTO locationDTO = locationMapper.locationToLocationDTO((Location) itr.next());
		}
		logger.debug("retreiveAllLocationDTO method ended");
		return LocationDTOList;
	}
}
