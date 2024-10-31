package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.PartnerEdu;
import com.ks.ksfinal.repository.PartnerEduRepo;
import java.util.List;

@Service
public class PartnerEduService {

	@Autowired
	private PartnerEduRepo PartnerEduRepo;
	
	// CREATE 
	public PartnerEdu createAvailability(PartnerEdu av) {
	    return PartnerEduRepo.save(av);
	}

	// READ
	public List<PartnerEdu> getAvailability() {
	    return PartnerEduRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		PartnerEduRepo.deleteById(availId);
	}
	
	// UPDATE
	public PartnerEdu updateAvailability(Integer availId, PartnerEdu availDetails) {
		PartnerEdu av = PartnerEduRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return PartnerEduRepo.save(av);
	}
	
	public List<PartnerEdu> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
