package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.CiSessions;
import com.ks.ksfinal.repository.CiSessionsRepo;
import java.util.List;

@Service
public class CiSessionsService {

	@Autowired
	private CiSessionsRepo CiSessionsRepo;
	
	// CREATE 
	public CiSessions createAvailability(CiSessions av) {
	    return CiSessionsRepo.save(av);
	}

	// READ
	public List<CiSessions> getAvailability() {
	    return CiSessionsRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		CiSessionsRepo.deleteById(availId);
	}
	
	// UPDATE
	public CiSessions updateAvailability(Integer availId, CiSessions availDetails) {
		CiSessions av = CiSessionsRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return CiSessionsRepo.save(av);
	}
	
	public List<CiSessions> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
