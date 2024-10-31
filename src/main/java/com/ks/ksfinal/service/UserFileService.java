package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserFile;
import com.ks.ksfinal.repository.UserFileRepo;
import java.util.List;

@Service
public class UserFileService {

	@Autowired
	private UserFileRepo UserFileRepo;
	
	// CREATE 
	public UserFile createAvailability(UserFile av) {
	    return UserFileRepo.save(av);
	}

	// READ
	public List<UserFile> getAvailability() {
	    return UserFileRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserFileRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserFile updateAvailability(Integer availId, UserFile availDetails) {
		UserFile av = UserFileRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserFileRepo.save(av);
	}
	
	public List<UserFile> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
