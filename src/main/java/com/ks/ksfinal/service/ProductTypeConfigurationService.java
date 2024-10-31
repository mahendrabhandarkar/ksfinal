package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductTypeConfiguration;
import com.ks.ksfinal.repository.ProductTypeConfigurationRepo;
import java.util.List;

@Service
public class ProductTypeConfigurationService {

	@Autowired
	private ProductTypeConfigurationRepo ProductTypeConfigurationRepo;
	
	// CREATE 
	public ProductTypeConfiguration createAvailability(ProductTypeConfiguration av) {
	    return ProductTypeConfigurationRepo.save(av);
	}

	// READ
	public List<ProductTypeConfiguration> getAvailability() {
	    return ProductTypeConfigurationRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductTypeConfigurationRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductTypeConfiguration updateAvailability(Integer availId, ProductTypeConfiguration availDetails) {
		ProductTypeConfiguration av = ProductTypeConfigurationRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductTypeConfigurationRepo.save(av);
	}
	
	public List<ProductTypeConfiguration> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
