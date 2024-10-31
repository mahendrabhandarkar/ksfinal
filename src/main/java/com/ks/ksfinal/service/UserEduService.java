package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserEdu;
import com.ks.ksfinal.repository.UserEduRepo;
import java.util.List;

@Service
public class UserEduService {

	@Autowired
	private UserEduRepo UserEduRepo;
	
	// CREATE 
	public UserEdu createAvailability(UserEdu av) {
	    return UserEduRepo.save(av);
	}

	// READ
	public List<UserEdu> getAvailability() {
	    return UserEduRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserEduRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserEdu updateAvailability(Integer availId, UserEdu availDetails) {
		UserEdu av = UserEduRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserEduRepo.save(av);
	}
	
	public List<UserEdu> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
