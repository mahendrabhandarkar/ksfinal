package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AssetUpload;
import com.ks.ksfinal.repository.AssetUploadRepo;
import java.util.List;

@Service
public class AssetUploadService {

	@Autowired
	private AssetUploadRepo AssetUploadRepo;
	
	// CREATE 
	public AssetUpload createAsset(AssetUpload av) {
	    return AssetUploadRepo.save(av);
	}

	// READ
	public List<AssetUpload> getAsset() {
	    return AssetUploadRepo.findAll();
	}

	// DELETE
	public void deleteAsset(Integer availId) {
		AssetUploadRepo.deleteById(availId);
	}
	
	// UPDATE
	public AssetUpload updateAsset(Integer availId, AssetUpload availDetails) {
		AssetUpload av = AssetUploadRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AssetUploadRepo.save(av);
	}
	
	public List<AssetUpload> getAllAssets() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAsset();
	}
}
