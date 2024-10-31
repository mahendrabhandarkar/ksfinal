package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AdminAuthRule;
import com.ks.ksfinal.repository.AdminAuthRuleRepo;
import java.util.List;

@Service
public class AdminAuthRuleService {

	@Autowired
	private AdminAuthRuleRepo AdminAuthRuleRepo;
	
	// CREATE 
	public AdminAuthRule createAvailability(AdminAuthRule av) {
	    return AdminAuthRuleRepo.save(av);
	}

	// READ
	public List<AdminAuthRule> getAvailability() {
	    return AdminAuthRuleRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(String availId) {
		AdminAuthRuleRepo.deleteById(availId);
	}
	
	// UPDATE
	public AdminAuthRule updateAvailability(String availId, AdminAuthRule availDetails) {
		AdminAuthRule av = AdminAuthRuleRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AdminAuthRuleRepo.save(av);
	}
	
	public List<AdminAuthRule> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
