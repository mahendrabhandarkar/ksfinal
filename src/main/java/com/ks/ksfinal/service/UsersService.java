package com.ks.ksfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ks.ksfinal.dto.UsersRequest;
import com.ks.ksfinal.model.Users;
import com.ks.ksfinal.repository.UsersRepo;
import java.util.List;
import java.util.Optional;

import com.ks.ksfinal.exception.UserNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class UsersService {

	private static final Logger logger = LogManager.getLogger(UsersService.class);

	@Autowired
	private UsersRepo usersRepo;
	
	// CREATE 
	public Users saveUser(UsersRequest userRequest) {
		Users uc = new Users();
		uc.setUsername(userRequest.getUsername());
		uc.setEmail(userRequest.getEmail());
		uc.setAuthKey(userRequest.getAuthKey());
		uc.setPasswordHash(userRequest.getPasswordHash());
		uc.setPasswordResetToken(userRequest.getPasswordResetToken());
		uc.setVerificationToken(userRequest.getVerificationToken());
		uc.setStatus(userRequest.getStatus());
		uc.setCreatedAt(userRequest.getCreatedAt());
		uc.setUpdatedAt(userRequest.getUpdatedAt());
        return usersRepo.save(uc);
    }
	
	public Users createUser(Users av) {
	    return usersRepo.save(av);
	}

	// READ
	public List<Users> getAllUsers() {
	    return usersRepo.findAll();
	}

	// DELETE
	public void deleteUser(Integer availId) {
		usersRepo.deleteById(availId);
	}
	
	// UPDATE
	public Users updateUser(Integer availId, Users availDetails) {
		Users av = usersRepo.findById(availId).get();
	//	av.setCustId(availDetails.getCustId());
	//	av.setOffId(availDetails.getOffId());
	    
	    return usersRepo.save(av);
	}
	
	public Users getUser(Integer availId) throws UserNotFoundException {
		logger.info("Welcome to UrbanController");
		Users av= usersRepo.findById(availId).orElse(null);
		if(av!=null){
            return av;
        }else{
            throw new UserNotFoundException("User not found with id : "+availId);
        }
	}
	
}
