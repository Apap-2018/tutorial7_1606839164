package com.apap.tutorial7.service;

import org.springframework.stereotype.Service;

import com.apap.tutorial7.model.PilotModel;

@Service
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	PilotModel getPilotDetailById(long id);
	void updatePilot(long id,PilotModel pilot);
	
	PilotModel addPilot(PilotModel pilot);
	void deletePilot(PilotModel pilot);

}