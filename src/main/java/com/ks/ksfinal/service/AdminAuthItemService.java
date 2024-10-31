package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AdminAuthItem;
import com.ks.ksfinal.repository.AdminAuthItemRepo;
import java.util.List;

@Service
public class AdminAuthItemService {

	@Autowired
	private AdminAuthItemRepo AdminAuthItemRepo;
	
	// CREATE 
	public AdminAuthItem createAvailability(AdminAuthItem av) {
	    return AdminAuthItemRepo.save(av);
	}

	// READ
	public List<AdminAuthItem> getAvailability() {
	    return AdminAuthItemRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(String availId) {
		AdminAuthItemRepo.deleteById(availId);
	}
	
	// UPDATE
	public AdminAuthItem updateAvailability(String availId, AdminAuthItem availDetails) {
		AdminAuthItem av = AdminAuthItemRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AdminAuthItemRepo.save(av);
	}
	
	public List<AdminAuthItem> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
