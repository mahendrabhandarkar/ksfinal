package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AdminAuthAssignment;
import com.ks.ksfinal.repository.AdminAuthAssignmentRepo;
import java.util.List;

@Service
public class AdminAuthAssignmentService {

	@Autowired
	private AdminAuthAssignmentRepo AdminAuthAssignmentRepo;
	
	// CREATE 
	public AdminAuthAssignment createAvailability(AdminAuthAssignment av) {
	    return AdminAuthAssignmentRepo.save(av);
	}

	// READ
	public List<AdminAuthAssignment> getAvailability() {
	    return AdminAuthAssignmentRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AdminAuthAssignmentRepo.deleteById(availId);
	}
	
	// UPDATE
	public AdminAuthAssignment updateAvailability(Integer availId, AdminAuthAssignment availDetails) {
		AdminAuthAssignment av = AdminAuthAssignmentRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AdminAuthAssignmentRepo.save(av);
	}
	
	public List<AdminAuthAssignment> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
