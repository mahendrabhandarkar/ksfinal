package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.SendMessage;
import com.ks.ksfinal.repository.SendMessageRepo;
import java.util.List;

@Service
public class SendMessageService {

	@Autowired
	private SendMessageRepo SendMessageRepo;
	
	// CREATE 
	public SendMessage createAvailability(SendMessage av) {
	    return SendMessageRepo.save(av);
	}

	// READ
	public List<SendMessage> getAvailability() {
	    return SendMessageRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		SendMessageRepo.deleteById(availId);
	}
	
	// UPDATE
	public SendMessage updateAvailability(Integer availId, SendMessage availDetails) {
		SendMessage av = SendMessageRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return SendMessageRepo.save(av);
	}
	
	public List<SendMessage> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
