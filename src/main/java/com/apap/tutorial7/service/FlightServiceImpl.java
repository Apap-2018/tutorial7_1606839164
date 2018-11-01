package com.apap.tutorial7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.repository.FlightDB;

@Service("flightService")
@Transactional
public class FlightServiceImpl implements FlightService{
	@Autowired
	private FlightDB flightDB;
	
	@Override
	public FlightModel addFlight(FlightModel flight) {
		return flightDB.save(flight);
	}
	
	public FlightModel findFlight(long id) {
		return flightDB.findById(id);	
	}
	
	public List<FlightModel> findAllFlight(){
		return flightDB.findAll();
	}	
	
	@Override
	public FlightModel getFlightDetailByFlightNumber(String flightNumber) {
		return flightDB.findByFlightNumber(flightNumber);
	}

	@Override
	public FlightModel getFlightDetailByFlightId(long id) {
		return flightDB.findById(id);
	}

	@Override
	public void deleteFlight(FlightModel flight) {
		flightDB.delete(flight);	
	}

	@Override
	public void updateFlight(long flightId, FlightModel flight) {
		flightDB.save(flight);
	}
}