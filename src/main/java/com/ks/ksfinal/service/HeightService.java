package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Height;
import com.ks.ksfinal.repository.HeightRepo;
import java.util.List;

@Service
public class HeightService {

	@Autowired
	private HeightRepo HeightRepo;
	
	// CREATE 
	public Height createAvailability(Height av) {
	    return HeightRepo.save(av);
	}

	// READ
	public List<Height> getAvailability() {
	    return HeightRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		HeightRepo.deleteById(availId);
	}
	
	// UPDATE
	public Height updateAvailability(Integer availId, Height availDetails) {
		Height av = HeightRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return HeightRepo.save(av);
	}
	
	public List<Height> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
