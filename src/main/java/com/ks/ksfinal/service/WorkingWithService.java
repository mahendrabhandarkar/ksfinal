package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.WorkingWith;
import com.ks.ksfinal.repository.WorkingWithRepo;
import java.util.List;

@Service
public class WorkingWithService {

	@Autowired
	private WorkingWithRepo WorkingWithRepo;
	
	// CREATE 
	public WorkingWith createAvailability(WorkingWith av) {
	    return WorkingWithRepo.save(av);
	}

	// READ
	public List<WorkingWith> getAvailability() {
	    return WorkingWithRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		WorkingWithRepo.deleteById(availId);
	}
	
	// UPDATE
	public WorkingWith updateAvailability(Integer availId, WorkingWith availDetails) {
		WorkingWith av = WorkingWithRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return WorkingWithRepo.save(av);
	}
	
	public List<WorkingWith> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
