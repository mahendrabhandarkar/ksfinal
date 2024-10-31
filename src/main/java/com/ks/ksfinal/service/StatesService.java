package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.States;
import com.ks.ksfinal.repository.StatesRepo;
import java.util.List;

@Service
public class StatesService {

	@Autowired
	private StatesRepo StatesRepo;
	
	// CREATE 
	public States createAvailability(States av) {
	    return StatesRepo.save(av);
	}

	// READ
	public List<States> getAvailability() {
	    return StatesRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		StatesRepo.deleteById(availId);
	}
	
	// UPDATE
	public States updateAvailability(Integer availId, States availDetails) {
		States av = StatesRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return StatesRepo.save(av);
	}
	
	public List<States> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
