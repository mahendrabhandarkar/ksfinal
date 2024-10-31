package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.LoginAttempts;
import com.ks.ksfinal.repository.LoginAttemptsRepo;
import java.util.List;

@Service
public class LoginAttemptsService {

	@Autowired
	private LoginAttemptsRepo LoginAttemptsRepo;
	
	// CREATE 
	public LoginAttempts createAvailability(LoginAttempts av) {
	    return LoginAttemptsRepo.save(av);
	}

	// READ
	public List<LoginAttempts> getAvailability() {
	    return LoginAttemptsRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		LoginAttemptsRepo.deleteById(availId);
	}
	
	// UPDATE
	public LoginAttempts updateAvailability(Integer availId, LoginAttempts availDetails) {
		LoginAttempts av = LoginAttemptsRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return LoginAttemptsRepo.save(av);
	}
	
	public List<LoginAttempts> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
