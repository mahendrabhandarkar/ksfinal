package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AdminUser;
import com.ks.ksfinal.repository.AdminUserRepo;
import java.util.List;

@Service
public class AdminUserService {

	@Autowired
	private AdminUserRepo AdminUserRepo;
	
	// CREATE 
	public AdminUser createAvailability(AdminUser av) {
	    return AdminUserRepo.save(av);
	}

	// READ
	public List<AdminUser> getAvailability() {
	    return AdminUserRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AdminUserRepo.deleteById(availId);
	}
	
	// UPDATE
	public AdminUser updateAvailability(Integer availId, AdminUser availDetails) {
		AdminUser av = AdminUserRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AdminUserRepo.save(av);
	}
	
	public List<AdminUser> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
