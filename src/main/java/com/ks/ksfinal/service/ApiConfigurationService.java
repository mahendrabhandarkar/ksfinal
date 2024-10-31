package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ApiConfiguration;
import com.ks.ksfinal.repository.ApiConfigurationRepo;
import java.util.List;

@Service
public class ApiConfigurationService {

	@Autowired
	private ApiConfigurationRepo ApiConfigurationRepo;
	
	// CREATE 
	public ApiConfiguration createAvailability(ApiConfiguration av) {
	    return ApiConfigurationRepo.save(av);
	}

	// READ
	public List<ApiConfiguration> getAvailability() {
	    return ApiConfigurationRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ApiConfigurationRepo.deleteById(availId);
	}
	
	// UPDATE
	public ApiConfiguration updateAvailability(Integer availId, ApiConfiguration availDetails) {
		ApiConfiguration av = ApiConfigurationRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ApiConfigurationRepo.save(av);
	}
	
	public List<ApiConfiguration> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
