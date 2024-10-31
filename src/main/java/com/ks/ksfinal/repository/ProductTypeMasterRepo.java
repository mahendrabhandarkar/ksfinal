package com.ks.ksfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ks.ksfinal.model.ProductTypeMaster;

//@ComponentScan(basePackages = {"com.uc.controller", "com.uc.service", "com.uc.repository", "com.uc.model"})
@Repository 
public interface ProductTypeMasterRepo extends JpaRepository<ProductTypeMaster, Integer> 
{

}
