package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Religion;
import com.ks.ksfinal.repository.ReligionRepo;
import java.util.List;

@Service
public class ReligionService {

	@Autowired
	private ReligionRepo ReligionRepo;
	
	// CREATE 
	public Religion createAvailability(Religion av) {
	    return ReligionRepo.save(av);
	}

	// READ
	public List<Religion> getAvailability() {
	    return ReligionRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ReligionRepo.deleteById(availId);
	}
	
	// UPDATE
	public Religion updateAvailability(Integer availId, Religion availDetails) {
		Religion av = ReligionRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ReligionRepo.save(av);
	}
	
	public List<Religion> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
