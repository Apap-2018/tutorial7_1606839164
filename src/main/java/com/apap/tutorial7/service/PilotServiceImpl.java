package com.apap.tutorial7.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial7.model.PilotModel;
import com.apap.tutorial7.repository.PilotDB;

@Service("pilotService")
@Transactional
public class PilotServiceImpl implements PilotService{
	@Autowired 
	private PilotDB pilotDB;
	
	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDB.findByLicenseNumber(licenseNumber);
	}
	
	public void deletePilot(PilotModel pilot) {
		pilotDB.delete(pilot);
	}

	@Override
	public PilotModel addPilot(PilotModel pilot) {
		return pilotDB.save(pilot);
	}

	@Override
	public PilotModel getPilotDetailById(long id) {
		return pilotDB.findById(id);
	}

	@Override
	public void updatePilot(long id, PilotModel pilot) {
		pilotDB.findById(id).setId(id);
		
	}
	
	public void updatePilot(String licenseNumber, String nama, int flyHour) {
		System.out.println(nama + " " + flyHour + " license : " + licenseNumber);
		pilotDB.findByLicenseNumber(licenseNumber).setName(nama);
		pilotDB.findByLicenseNumber(licenseNumber).setFlyHour(flyHour);
	}
	

}