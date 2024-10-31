package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AdminAuthItemChild;
import com.ks.ksfinal.repository.AdminAuthItemChildRepo;
import java.util.List;

@Service
public class AdminAuthItemChildService {

	@Autowired
	private AdminAuthItemChildRepo AdminAuthItemChildRepo;
	
	// CREATE 
	public AdminAuthItemChild createAvailability(AdminAuthItemChild av) {
	    return AdminAuthItemChildRepo.save(av);
	}

	// READ
	public List<AdminAuthItemChild> getAvailability() {
	    return AdminAuthItemChildRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AdminAuthItemChildRepo.deleteById(availId);
	}
	
	// UPDATE
	public AdminAuthItemChild updateAvailability(Integer availId, AdminAuthItemChild availDetails) {
		AdminAuthItemChild av = AdminAuthItemChildRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AdminAuthItemChildRepo.save(av);
	}
	
	public List<AdminAuthItemChild> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
