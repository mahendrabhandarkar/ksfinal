package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserAutoLogin;
import com.ks.ksfinal.repository.UserAutoLoginRepo;
import java.util.List;

@Service
public class UserAutoLoginService {

	@Autowired
	private UserAutoLoginRepo UserAutoLoginRepo;
	
	// CREATE 
	public UserAutoLogin createAvailability(UserAutoLogin av) {
	    return UserAutoLoginRepo.save(av);
	}

	// READ
	public List<UserAutoLogin> getAvailability() {
	    return UserAutoLoginRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserAutoLoginRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserAutoLogin updateAvailability(Integer availId, UserAutoLogin availDetails) {
		UserAutoLogin av = UserAutoLoginRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserAutoLoginRepo.save(av);
	}
	
	public List<UserAutoLogin> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
