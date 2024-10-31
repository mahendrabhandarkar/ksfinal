package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserLifestyle;
import com.ks.ksfinal.repository.UserLifestyleRepo;
import java.util.List;

@Service
public class UserLifestyleService {

	@Autowired
	private UserLifestyleRepo UserLifestyleRepo;
	
	// CREATE 
	public UserLifestyle createAvailability(UserLifestyle av) {
	    return UserLifestyleRepo.save(av);
	}

	// READ
	public List<UserLifestyle> getAvailability() {
	    return UserLifestyleRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserLifestyleRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserLifestyle updateAvailability(Integer availId, UserLifestyle availDetails) {
		UserLifestyle av = UserLifestyleRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserLifestyleRepo.save(av);
	}
	
	public List<UserLifestyle> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
