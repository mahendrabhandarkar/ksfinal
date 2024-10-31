package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Migration;
import com.ks.ksfinal.repository.MigrationRepo;
import java.util.List;

@Service
public class MigrationService {

	@Autowired
	private MigrationRepo MigrationRepo;
	
	// CREATE 
	public Migration createAvailability(Migration av) {
	    return MigrationRepo.save(av);
	}

	// READ
	public List<Migration> getAvailability() {
	    return MigrationRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		MigrationRepo.deleteById(availId);
	}
	
	// UPDATE
	public Migration updateAvailability(Integer availId, Migration availDetails) {
		Migration av = MigrationRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return MigrationRepo.save(av);
	}
	
	public List<Migration> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
