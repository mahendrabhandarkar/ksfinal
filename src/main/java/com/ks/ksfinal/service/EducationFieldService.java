package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.EducationField;
import com.ks.ksfinal.repository.EducationFieldRepo;
import java.util.List;

@Service
public class EducationFieldService {

	@Autowired
	private EducationFieldRepo EducationFieldRepo;
	
	// CREATE 
	public EducationField createAvailability(EducationField av) {
	    return EducationFieldRepo.save(av);
	}

	// READ
	public List<EducationField> getAvailability() {
	    return EducationFieldRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		EducationFieldRepo.deleteById(availId);
	}
	
	// UPDATE
	public EducationField updateAvailability(Integer availId, EducationField availDetails) {
		EducationField av = EducationFieldRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return EducationFieldRepo.save(av);
	}
	
	public List<EducationField> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
