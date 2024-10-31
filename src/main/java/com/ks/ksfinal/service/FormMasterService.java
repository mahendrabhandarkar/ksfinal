package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.FormMaster;
import com.ks.ksfinal.repository.FormMasterRepo;
import java.util.List;

@Service
public class FormMasterService {

	@Autowired
	private FormMasterRepo FormMasterRepo;
	
	// CREATE 
	public FormMaster createAvailability(FormMaster av) {
	    return FormMasterRepo.save(av);
	}

	// READ
	public List<FormMaster> getAvailability() {
	    return FormMasterRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		FormMasterRepo.deleteById(availId);
	}
	
	// UPDATE
	public FormMaster updateAvailability(Integer availId, FormMaster availDetails) {
		FormMaster av = FormMasterRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return FormMasterRepo.save(av);
	}
	
	public List<FormMaster> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
