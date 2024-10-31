package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.MessageInbox;
import com.ks.ksfinal.repository.MessageInboxRepo;
import java.util.List;

@Service
public class MessageInboxService {

	@Autowired
	private MessageInboxRepo MessageInboxRepo;
	
	// CREATE 
	public MessageInbox createAvailability(MessageInbox av) {
	    return MessageInboxRepo.save(av);
	}

	// READ
	public List<MessageInbox> getAvailability() {
	    return MessageInboxRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		MessageInboxRepo.deleteById(availId);
	}
	
	// UPDATE
	public MessageInbox updateAvailability(Integer availId, MessageInbox availDetails) {
		MessageInbox av = MessageInboxRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return MessageInboxRepo.save(av);
	}
	
	public List<MessageInbox> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
