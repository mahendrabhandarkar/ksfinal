package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.PartnerBackground;
import com.ks.ksfinal.repository.PartnerBackgroundRepo;
import java.util.List;

@Service
public class PartnerBackgroundService {

	@Autowired
	private PartnerBackgroundRepo PartnerBackgroundRepo;
	
	// CREATE 
	public PartnerBackground createAvailability(PartnerBackground av) {
	    return PartnerBackgroundRepo.save(av);
	}

	// READ
	public List<PartnerBackground> getAvailability() {
	    return PartnerBackgroundRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		PartnerBackgroundRepo.deleteById(availId);
	}
	
	// UPDATE
	public PartnerBackground updateAvailability(Integer availId, PartnerBackground availDetails) {
		PartnerBackground av = PartnerBackgroundRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return PartnerBackgroundRepo.save(av);
	}
	
	public List<PartnerBackground> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
