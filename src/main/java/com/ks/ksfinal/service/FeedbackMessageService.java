package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.FeedbackMessage;
import com.ks.ksfinal.repository.FeedbackMessageRepo;
import java.util.List;

@Service
public class FeedbackMessageService {

	@Autowired
	private FeedbackMessageRepo FeedbackMessageRepo;
	
	// CREATE 
	public FeedbackMessage createAvailability(FeedbackMessage av) {
	    return FeedbackMessageRepo.save(av);
	}

	// READ
	public List<FeedbackMessage> getAvailability() {
	    return FeedbackMessageRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		FeedbackMessageRepo.deleteById(availId);
	}
	
	// UPDATE
	public FeedbackMessage updateAvailability(Integer availId, FeedbackMessage availDetails) {
		FeedbackMessage av = FeedbackMessageRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return FeedbackMessageRepo.save(av);
	}
	
	public List<FeedbackMessage> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
