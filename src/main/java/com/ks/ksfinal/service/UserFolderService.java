package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserFolder;
import com.ks.ksfinal.repository.UserFolderRepo;
import java.util.List;

@Service
public class UserFolderService {

	@Autowired
	private UserFolderRepo UserFolderRepo;
	
	// CREATE 
	public UserFolder createAvailability(UserFolder av) {
	    return UserFolderRepo.save(av);
	}

	// READ
	public List<UserFolder> getAvailability() {
	    return UserFolderRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserFolderRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserFolder updateAvailability(Integer availId, UserFolder availDetails) {
		UserFolder av = UserFolderRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserFolderRepo.save(av);
	}
	
	public List<UserFolder> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
