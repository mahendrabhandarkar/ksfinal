package com.ks.ksfinal.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ks.ksfinal.repository.impl.UsersCustomRepo;
import com.ks.ksfinal.model.UserHobbies;
import com.ks.ksfinal.model.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// For Paging and Sorting

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

//@ComponentScan(basePackages = {"com.uc.controller", "com.uc.service", "com.uc.repository", "com.uc.model"})
@Repository 
public interface UsersRepo extends JpaRepository<Users, Integer>, UsersCustomRepo, JpaSpecificationExecutor<Users>
{
	Users findById(int id);

	Users findByUsername(String userName);

	// For Paging and Sorting
	Page<Users> findByUsername(boolean published, Pageable pageable);

 	Page<Users> findByUsernameContaining(String title, Pageable pageable);
  
  	List<Users> findByUsernameContaining(String title, Sort sort);
  	
  	@Query(value = "SELECT u FROM users u where u.username like %?1% ")
  	List<Users> findAllUsers(String uname, Sort sort);
  	
  	@Query(value = "SELECT u, uh FROM users u INNER JOIN user_hobbies uh on u.id = uh.userId where u.username like %?1% ")
  	Map<Users, UserHobbies> findAllUserAndItsHobbies(String uname, Sort sort);
}
