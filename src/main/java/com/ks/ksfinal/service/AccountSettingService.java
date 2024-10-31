package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.model.AccountSetting;
import com.ks.ksfinal.repository.AccountSettingRepo;
import java.util.List;

@Service
public class AccountSettingService {

	@Autowired
	private AccountSettingRepo AccountSettingRepo;
	
	// CREATE 
	public AccountSetting createAvailability(AccountSetting av) {
	    return AccountSettingRepo.save(av);
	}

	// READ
	public List<AccountSetting> getAvailability() {
	    return AccountSettingRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		AccountSettingRepo.deleteById(availId);
	}
	
	// UPDATE
	public AccountSetting updateAvailability(Integer availId, AccountSetting availDetails) {
		AccountSetting av = AccountSettingRepo.findById(availId).get();
//		av.setCustId(availDetails.getCustId());
//		av.setOffId(availDetails.getOffId());
	    
	    return AccountSettingRepo.save(av);
	}
	
	public List<AccountSetting> getAllEmployees() {
	//	logger.info("Welcome to UrbanController");
	    return this.getAvailability();
	}
	
}
