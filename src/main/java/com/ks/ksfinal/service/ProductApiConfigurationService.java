package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductApiConfiguration;
import com.ks.ksfinal.repository.ProductApiConfigurationRepo;
import java.util.List;

@Service
public class ProductApiConfigurationService {

	@Autowired
	private ProductApiConfigurationRepo ProductApiConfigurationRepo;
	
	// CREATE 
	public ProductApiConfiguration createAvailability(ProductApiConfiguration av) {
	    return ProductApiConfigurationRepo.save(av);
	}

	// READ
	public List<ProductApiConfiguration> getAvailability() {
	    return ProductApiConfigurationRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductApiConfigurationRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductApiConfiguration updateAvailability(Integer availId, ProductApiConfiguration availDetails) {
		ProductApiConfiguration av = ProductApiConfigurationRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductApiConfigurationRepo.save(av);
	}
	
	public List<ProductApiConfiguration> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
