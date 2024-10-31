package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserProfiles;
import com.ks.ksfinal.repository.UserProfilesRepo;
import java.util.List;

@Service
public class UserProfilesService {

	@Autowired
	private UserProfilesRepo UserProfilesRepo;
	
	// CREATE 
	public UserProfiles createAvailability(UserProfiles av) {
	    return UserProfilesRepo.save(av);
	}

	// READ
	public List<UserProfiles> getAvailability() {
	    return UserProfilesRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserProfilesRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserProfiles updateAvailability(Integer availId, UserProfiles availDetails) {
		UserProfiles av = UserProfilesRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserProfilesRepo.save(av);
	}
	
	public List<UserProfiles> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
