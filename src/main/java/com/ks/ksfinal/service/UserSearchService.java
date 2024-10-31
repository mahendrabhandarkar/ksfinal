package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserSearch;
import com.ks.ksfinal.repository.UserSearchRepo;
import java.util.List;

@Service
public class UserSearchService {

	@Autowired
	private UserSearchRepo UserSearchRepo;
	
	// CREATE 
	public UserSearch createAvailability(UserSearch av) {
	    return UserSearchRepo.save(av);
	}

	// READ
	public List<UserSearch> getAvailability() {
	    return UserSearchRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserSearchRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserSearch updateAvailability(Integer availId, UserSearch availDetails) {
		UserSearch av = UserSearchRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserSearchRepo.save(av);
	}
	
	public List<UserSearch> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
