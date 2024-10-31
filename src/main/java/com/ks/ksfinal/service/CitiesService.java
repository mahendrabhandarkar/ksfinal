package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Cities;
import com.ks.ksfinal.repository.CitiesRepo;
import java.util.List;

@Service
public class CitiesService {

	@Autowired
	private CitiesRepo CitiesRepo;
	
	// CREATE 
	public Cities createAvailability(Cities av) {
	    return CitiesRepo.save(av);
	}

	// READ
	public List<Cities> getAvailability() {
	    return CitiesRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		CitiesRepo.deleteById(availId);
	}
	
	// UPDATE
	public Cities updateAvailability(Integer availId, Cities availDetails) {
		Cities av = CitiesRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return CitiesRepo.save(av);
	}
	
	public List<Cities> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
