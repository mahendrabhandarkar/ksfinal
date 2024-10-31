package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.PartnerBasic;
import com.ks.ksfinal.repository.PartnerBasicRepo;
import java.util.List;

@Service
public class PartnerBasicService {

	@Autowired
	private PartnerBasicRepo PartnerBasicRepo;
	
	// CREATE 
	public PartnerBasic createAvailability(PartnerBasic av) {
	    return PartnerBasicRepo.save(av);
	}

	// READ
	public List<PartnerBasic> getAvailability() {
	    return PartnerBasicRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		PartnerBasicRepo.deleteById(availId);
	}
	
	// UPDATE
	public PartnerBasic updateAvailability(Integer availId, PartnerBasic availDetails) {
		PartnerBasic av = PartnerBasicRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return PartnerBasicRepo.save(av);
	}
	
	public List<PartnerBasic> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
