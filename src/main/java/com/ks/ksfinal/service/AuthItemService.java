package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AuthItem;
import com.ks.ksfinal.repository.AuthItemRepo;
import java.util.List;

@Service
public class AuthItemService {

	@Autowired
	private AuthItemRepo AuthItemRepo;
	
	// CREATE 
	public AuthItem createAvailability(AuthItem av) {
	    return AuthItemRepo.save(av);
	}

	// READ
	public List<AuthItem> getAvailability() {
	    return AuthItemRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(String availId) {
		AuthItemRepo.deleteById(availId);
	}
	
	// UPDATE
	public AuthItem updateAvailability(String availId, AuthItem availDetails) {
		AuthItem av = AuthItemRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AuthItemRepo.save(av);
	}
	
	public List<AuthItem> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
