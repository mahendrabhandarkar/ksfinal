package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Community;
import com.ks.ksfinal.repository.CommunityRepo;
import java.util.List;

@Service
public class CommunityService {

	@Autowired
	private CommunityRepo CommunityRepo;
	
	// CREATE 
	public Community createAvailability(Community av) {
	    return CommunityRepo.save(av);
	}

	// READ
	public List<Community> getAvailability() {
	    return CommunityRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		CommunityRepo.deleteById(availId);
	}
	
	// UPDATE
	public Community updateAvailability(Integer availId, Community availDetails) {
		Community av = CommunityRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return CommunityRepo.save(av);
	}
	
	public List<Community> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
