package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.ProductService;
import com.ks.ksfinal.repository.ProductServiceRepo;
import java.util.List;

@Service
public class ProductServiceService {

	@Autowired
	private ProductServiceRepo ProductServiceRepo;
	
	// CREATE 
	public ProductService createAvailability(ProductService av) {
	    return ProductServiceRepo.save(av);
	}

	// READ
	public List<ProductService> getAvailability() {
	    return ProductServiceRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		ProductServiceRepo.deleteById(availId);
	}
	
	// UPDATE
	public ProductService updateAvailability(Integer availId, ProductService availDetails) {
		ProductService av = ProductServiceRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return ProductServiceRepo.save(av);
	}
	
	public List<ProductService> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
