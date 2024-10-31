package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductMaster;
import com.ks.ksfinal.repository.ProductMasterRepo;
import java.util.List;

@Service
public class ProductMasterService {

	@Autowired
	private ProductMasterRepo ProductMasterRepo;
	
	// CREATE 
	public ProductMaster createAvailability(ProductMaster av) {
	    return ProductMasterRepo.save(av);
	}

	// READ
	public List<ProductMaster> getAvailability() {
	    return ProductMasterRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductMasterRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductMaster updateAvailability(Integer availId, ProductMaster availDetails) {
		ProductMaster av = ProductMasterRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductMasterRepo.save(av);
	}
	
	public List<ProductMaster> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
