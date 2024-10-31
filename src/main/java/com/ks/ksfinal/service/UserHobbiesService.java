package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserHobbies;
import com.ks.ksfinal.repository.UserHobbiesRepo;
import java.util.List;

@Service
public class UserHobbiesService {

	@Autowired
	private UserHobbiesRepo UserHobbiesRepo;
	
	// CREATE 
	public UserHobbies createAvailability(UserHobbies av) {
	    return UserHobbiesRepo.save(av);
	}

	// READ
	public List<UserHobbies> getAvailability() {
	    return UserHobbiesRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserHobbiesRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserHobbies updateAvailability(Integer availId, UserHobbies availDetails) {
		UserHobbies av = UserHobbiesRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserHobbiesRepo.save(av);
	}
	
	public List<UserHobbies> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
