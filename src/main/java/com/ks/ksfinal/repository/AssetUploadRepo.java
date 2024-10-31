package com.ks.ksfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Import;

import com.ks.ksfinal.model.AssetUpload;

//@ComponentScan(basePackages = {"com.uc.controller", "com.uc.service", "com.uc.repository", "com.uc.model"})
@Repository 
public interface AssetUploadRepo extends JpaRepository<AssetUpload, Integer> 
{

}
