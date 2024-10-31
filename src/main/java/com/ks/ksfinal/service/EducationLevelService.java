package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.EducationLevel;
import com.ks.ksfinal.repository.EducationLevelRepo;
import java.util.List;

@Service
public class EducationLevelService {

	@Autowired
	private EducationLevelRepo EducationLevelRepo;
	
	// CREATE 
	public EducationLevel createAvailability(EducationLevel av) {
	    return EducationLevelRepo.save(av);
	}

	// READ
	public List<EducationLevel> getAvailability() {
	    return EducationLevelRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		EducationLevelRepo.deleteById(availId);
	}
	
	// UPDATE
	public EducationLevel updateAvailability(Integer availId, EducationLevel availDetails) {
		EducationLevel av = EducationLevelRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return EducationLevelRepo.save(av);
	}
	
	public List<EducationLevel> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
