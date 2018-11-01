package com.apap.tutorial7.service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial7.model.FlightModel;
import com.apap.tutorial7.model.PilotModel;

@Service
public interface FlightService {
	FlightModel addFlight(FlightModel flight);
	FlightModel findFlight(long id);
	List<FlightModel> findAllFlight();
	
	FlightModel getFlightDetailByFlightNumber(String flightNumber);
	FlightModel getFlightDetailByFlightId(long id);
	void deleteFlight(FlightModel flight);
	void updateFlight(long flightId, FlightModel flight);

}