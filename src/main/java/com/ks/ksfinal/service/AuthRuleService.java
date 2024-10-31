package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AuthRule;
import com.ks.ksfinal.repository.AuthRuleRepo;
import java.util.List;

@Service
public class AuthRuleService {

	@Autowired
	private AuthRuleRepo AuthRuleRepo;
	
	// CREATE 
	public AuthRule createAvailability(AuthRule av) {
	    return AuthRuleRepo.save(av);
	}

	// READ
	public List<AuthRule> getAvailability() {
	    return AuthRuleRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(String availId) {
		AuthRuleRepo.deleteById(availId);
	}
	
	// UPDATE
	public AuthRule updateAvailability(String availId, AuthRule availDetails) {
		AuthRule av = AuthRuleRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AuthRuleRepo.save(av);
	}
	
	public List<AuthRule> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
