package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserBackground;
import com.ks.ksfinal.repository.UserBackgroundRepo;
import java.util.List;

@Service
public class UserBackgroundService {

	@Autowired
	private UserBackgroundRepo UserBackgroundRepo;
	
	// CREATE 
	public UserBackground createAvailability(UserBackground av) {
	    return UserBackgroundRepo.save(av);
	}

	// READ
	public List<UserBackground> getAvailability() {
	    return UserBackgroundRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserBackgroundRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserBackground updateAvailability(Integer availId, UserBackground availDetails) {
		UserBackground av = UserBackgroundRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserBackgroundRepo.save(av);
	}
	
	public List<UserBackground> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
