package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.WorkingAs;
import com.ks.ksfinal.repository.WorkingAsRepo;
import java.util.List;

@Service
public class WorkingAsService {

	@Autowired
	private WorkingAsRepo WorkingAsRepo;
	
	// CREATE 
	public WorkingAs createAvailability(WorkingAs av) {
	    return WorkingAsRepo.save(av);
	}

	// READ
	public List<WorkingAs> getAvailability() {
	    return WorkingAsRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		WorkingAsRepo.deleteById(availId);
	}
	
	// UPDATE
	public WorkingAs updateAvailability(Integer availId, WorkingAs availDetails) {
		WorkingAs av = WorkingAsRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return WorkingAsRepo.save(av);
	}
	
	public List<WorkingAs> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
