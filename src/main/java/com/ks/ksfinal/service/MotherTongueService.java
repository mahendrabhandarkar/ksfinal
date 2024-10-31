package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.MotherTongue;
import com.ks.ksfinal.repository.MotherTongueRepo;
import java.util.List;

@Service
public class MotherTongueService {

	@Autowired
	private MotherTongueRepo MotherTongueRepo;
	
	// CREATE 
	public MotherTongue createAvailability(MotherTongue av) {
	    return MotherTongueRepo.save(av);
	}

	// READ
	public List<MotherTongue> getAvailability() {
	    return MotherTongueRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		MotherTongueRepo.deleteById(availId);
	}
	
	// UPDATE
	public MotherTongue updateAvailability(Integer availId, MotherTongue availDetails) {
		MotherTongue av = MotherTongueRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return MotherTongueRepo.save(av);
	}
	
	public List<MotherTongue> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
