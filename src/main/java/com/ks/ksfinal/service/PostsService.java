package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.Posts;
import com.ks.ksfinal.repository.PostsRepo;
import java.util.List;

@Service
public class PostsService {

	@Autowired
	private PostsRepo PostsRepo;
	
	// CREATE 
	public Posts createAvailability(Posts av) {
	    return PostsRepo.save(av);
	}

	// READ
	public List<Posts> getAvailability() {
	    return PostsRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		PostsRepo.deleteById(availId);
	}
	
	// UPDATE
	public Posts updateAvailability(Integer availId, Posts availDetails) {
		Posts av = PostsRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return PostsRepo.save(av);
	}
	
	public List<Posts> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
