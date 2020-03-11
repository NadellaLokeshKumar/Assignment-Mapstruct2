package com.ito.mapstruct.dto;

import java.util.List;

public class LocationDTO {

	private int locationId;
	private String locationName;
	private String address;
	private List<VehicleDTO> vehicleList;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<VehicleDTO> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<VehicleDTO> vehicleList) {
		this.vehicleList = vehicleList;
	}

}
