package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.UserAlbum;
import com.ks.ksfinal.repository.UserAlbumRepo;
import java.util.List;

@Service
public class UserAlbumService {

	@Autowired
	private UserAlbumRepo UserAlbumRepo;
	
	// CREATE 
	public UserAlbum createAvailability(UserAlbum av) {
	    return UserAlbumRepo.save(av);
	}

	// READ
	public List<UserAlbum> getAvailability() {
	    return UserAlbumRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		UserAlbumRepo.deleteById(availId);
	}
	
	// UPDATE
	public UserAlbum updateAvailability(Integer availId, UserAlbum availDetails) {
		UserAlbum av = UserAlbumRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return UserAlbumRepo.save(av);
	}
	
	public List<UserAlbum> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
