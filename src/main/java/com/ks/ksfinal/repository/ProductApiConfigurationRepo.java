package com.ks.ksfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ks.ksfinal.model.ProductApiConfiguration;

//@ComponentScan(basePackages = {"com.uc.controller", "com.uc.service", "com.uc.repository", "com.uc.model"})
@Repository 
public interface ProductApiConfigurationRepo extends JpaRepository<ProductApiConfiguration, Integer> 
{

}
