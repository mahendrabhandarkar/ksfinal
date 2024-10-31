package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserFamily;
import com.ks.ksfinal.repository.UserFamilyRepo;
import java.util.List;

@Service
public class UserFamilyService {

	@Autowired
	private UserFamilyRepo UserFamilyRepo;
	
	// CREATE 
	public UserFamily createAvailability(UserFamily av) {
	    return UserFamilyRepo.save(av);
	}

	// READ
	public List<UserFamily> getAvailability() {
	    return UserFamilyRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserFamilyRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserFamily updateAvailability(Integer availId, UserFamily availDetails) {
		UserFamily av = UserFamilyRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserFamilyRepo.save(av);
	}
	
	public List<UserFamily> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
