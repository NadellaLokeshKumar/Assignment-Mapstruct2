package com.ito.mapstruct.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ito.mapstruct.dto.Vehicle;
import com.ito.mapstruct.dto.VehicleDTO;
import com.ito.mapstruct.mapper.VehicleMapper;
import com.ito.mapstruct.repo.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	public static Logger logger = Logger.getLogger(VehicleServiceImpl.class);

	@Autowired
	public VehicleRepository vehicleRepo;

	@Autowired
	public VehicleMapper vehicleMapper;

	@Override
	public int save(VehicleDTO vehilce) {
		logger.debug("save method started");
		int vehicleId = vehicleRepo.save(vehicleMapper.vehicleDTOToVehicle(vehilce)).getVehicleId();
		logger.debug("save method ended");
		return vehicleId;
	}

	@Override
	public VehicleDTO retreiveVehcileDTO(int vehicleID) {
		logger.debug("retreiveVehcileDTO method started");
		VehicleDTO vehicleDTO = vehicleMapper.vehicleToVehicleDTO(vehicleRepo.getOne(vehicleID));
		logger.debug("retreiveVehcileDTO method ended");
		return vehicleDTO;
	}

	@Override
	public List<VehicleDTO> retreiveAllVehicleDTO() {
		logger.debug("retreiveAllVehicleDTO method started");
		List<Vehicle> vehicleList = vehicleRepo.findAll();
		ArrayList<VehicleDTO> vehicleDTOList = new ArrayList<VehicleDTO>();
		Iterator itr = vehicleList.iterator();
		while (itr.hasNext()) {
			VehicleDTO vehicleDTO = vehicleMapper.vehicleToVehicleDTO((Vehicle) itr.next());
		}
		logger.debug("retreiveAllVehicleDTO method ended");
		return vehicleDTOList;
	}

}
