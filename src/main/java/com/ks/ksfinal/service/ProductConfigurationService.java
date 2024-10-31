package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductConfiguration;
import com.ks.ksfinal.repository.ProductConfigurationRepo;
import java.util.List;

@Service
public class ProductConfigurationService {

	@Autowired
	private ProductConfigurationRepo ProductConfigurationRepo;
	
	// CREATE 
	public ProductConfiguration createAvailability(ProductConfiguration av) {
	    return ProductConfigurationRepo.save(av);
	}

	// READ
	public List<ProductConfiguration> getAvailability() {
	    return ProductConfigurationRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductConfigurationRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductConfiguration updateAvailability(Integer availId, ProductConfiguration availDetails) {
		ProductConfiguration av = ProductConfigurationRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductConfigurationRepo.save(av);
	}
	
	public List<ProductConfiguration> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
