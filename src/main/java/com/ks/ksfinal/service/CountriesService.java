package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Countries;
import com.ks.ksfinal.repository.CountriesRepo;
import java.util.List;

@Service
public class CountriesService {

	@Autowired
	private CountriesRepo CountriesRepo;
	
	// CREATE 
	public Countries createAvailability(Countries av) {
	    return CountriesRepo.save(av);
	}

	// READ
	public List<Countries> getAvailability() {
	    return CountriesRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		CountriesRepo.deleteById(availId);
	}
	
	// UPDATE
	public Countries updateAvailability(Integer availId, Countries availDetails) {
		Countries av = CountriesRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return CountriesRepo.save(av);
	}
	
	public List<Countries> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
