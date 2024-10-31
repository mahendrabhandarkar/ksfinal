package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AuthAssignment;
import com.ks.ksfinal.repository.AuthAssignmentRepo;
import java.util.List;

@Service
public class AuthAssignmentService {

	@Autowired
	private AuthAssignmentRepo AuthAssignmentRepo;
	
	// CREATE 
	public AuthAssignment createAvailability(AuthAssignment av) {
	    return AuthAssignmentRepo.save(av);
	}

	// READ
	public List<AuthAssignment> getAvailability() {
	    return AuthAssignmentRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AuthAssignmentRepo.deleteById(availId);
	}
	
	// UPDATE
	public AuthAssignment updateAvailability(Integer availId, AuthAssignment availDetails) {
		AuthAssignment av = AuthAssignmentRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AuthAssignmentRepo.save(av);
	}
	
	public List<AuthAssignment> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
