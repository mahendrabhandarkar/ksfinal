package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.SubCommunity;
import com.ks.ksfinal.repository.SubCommunityRepo;
import java.util.List;

@Service
public class SubCommunityService {

	@Autowired
	private SubCommunityRepo SubCommunityRepo;
	
	// CREATE 
	public SubCommunity createAvailability(SubCommunity av) {
	    return SubCommunityRepo.save(av);
	}

	// READ
	public List<SubCommunity> getAvailability() {
	    return SubCommunityRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		SubCommunityRepo.deleteById(availId);
	}
	
	// UPDATE
	public SubCommunity updateAvailability(Integer availId, SubCommunity availDetails) {
		SubCommunity av = SubCommunityRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return SubCommunityRepo.save(av);
	}
	
	public List<SubCommunity> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
