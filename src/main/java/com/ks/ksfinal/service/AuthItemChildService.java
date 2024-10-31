package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AuthItemChild;
import com.ks.ksfinal.repository.AuthItemChildRepo;
import java.util.List;

@Service
public class AuthItemChildService {

	@Autowired
	private AuthItemChildRepo AuthItemChildRepo;
	
	// CREATE 
	public AuthItemChild createAvailability(AuthItemChild av) {
	    return AuthItemChildRepo.save(av);
	}

	// READ
	public List<AuthItemChild> getAvailability() {
	    return AuthItemChildRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AuthItemChildRepo.deleteById(availId);
	}
	
	// UPDATE
	public AuthItemChild updateAvailability(Integer availId, AuthItemChild availDetails) {
		AuthItemChild av = AuthItemChildRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AuthItemChildRepo.save(av);
	}
	
	public List<AuthItemChild> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
