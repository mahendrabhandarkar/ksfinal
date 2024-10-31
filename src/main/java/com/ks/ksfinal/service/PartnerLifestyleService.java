package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.PartnerLifestyle;
import com.ks.ksfinal.repository.PartnerLifestyleRepo;
import java.util.List;

@Service
public class PartnerLifestyleService {

	@Autowired
	private PartnerLifestyleRepo PartnerLifestyleRepo;
	
	// CREATE 
	public PartnerLifestyle createAvailability(PartnerLifestyle av) {
	    return PartnerLifestyleRepo.save(av);
	}

	// READ
	public List<PartnerLifestyle> getAvailability() {
	    return PartnerLifestyleRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		PartnerLifestyleRepo.deleteById(availId);
	}
	
	// UPDATE
	public PartnerLifestyle updateAvailability(Integer availId, PartnerLifestyle availDetails) {
		PartnerLifestyle av = PartnerLifestyleRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return PartnerLifestyleRepo.save(av);
	}
	
	public List<PartnerLifestyle> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
