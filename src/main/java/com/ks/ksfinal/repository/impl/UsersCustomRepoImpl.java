package com.ks.ksfinal.repository.impl;

import com.ks.ksfinal.model.UserHobbies;
import com.ks.ksfinal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.List;

public class UsersCustomRepoImpl implements UsersCustomRepo {

	@Autowired
    private EntityManager entityManager;

    public List<Users> findByFirstname(String firstname) {

        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery cq=cb.createQuery(Users.class);

        Root<Users> employee=cq.from(Users.class);
        
        Predicate firstNamePredicate=cb.like(employee.get("username"),"%"+firstname+"%");

        cq.where(firstNamePredicate);

        TypedQuery<Users> query=entityManager.createQuery(cq);

        return query.getResultList();
    }
    
    public List<Users> findByFirstnameResult(String firstname) {

        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery cq=cb.createQuery(Users.class);

        Root<Users> employee=cq.from(Users.class);
        
        Predicate firstNamePredicate=cb.like(employee.get("username"),"%"+firstname+"%");

        cq.where(firstNamePredicate);

        TypedQuery<Users> query=entityManager.createQuery(cq);

        return query.getResultList();
    }
}
