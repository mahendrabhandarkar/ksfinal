package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductTypeMaster;
import com.ks.ksfinal.repository.ProductTypeMasterRepo;
import java.util.List;

@Service
public class ProductTypeMasterService {

	@Autowired
	private ProductTypeMasterRepo ProductTypeMasterRepo;
	
	// CREATE 
	public ProductTypeMaster createAvailability(ProductTypeMaster av) {
	    return ProductTypeMasterRepo.save(av);
	}

	// READ
	public List<ProductTypeMaster> getAvailability() {
	    return ProductTypeMasterRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductTypeMasterRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductTypeMaster updateAvailability(Integer availId, ProductTypeMaster availDetails) {
		ProductTypeMaster av = ProductTypeMasterRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductTypeMasterRepo.save(av);
	}
	
	public List<ProductTypeMaster> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
