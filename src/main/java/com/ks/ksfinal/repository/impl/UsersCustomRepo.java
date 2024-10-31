package com.ks.ksfinal.repository.impl;

import com.ks.ksfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.List;

public interface UsersCustomRepo {

    public List<Users> findByFirstname(String firstname); 
    
    public List<Users> findByFirstnameResult(String firstname); 
    
}
