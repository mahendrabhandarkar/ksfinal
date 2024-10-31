package com.ks.ksfinal.specifications;

import jakarta.persistence.criteria.Join;

import org.springframework.data.jpa.domain.Specification;

import com.ks.ksfinal.model.UserHobbies;
import com.ks.ksfinal.model.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersSpecification {
	public static Specification<Users> hasUsername(String firstname){
        return ((root, criteriaQuery, criteriaBuilder) -> {
    //        return criteriaBuilder.equal(root.get("username"),firstname);
        	return criteriaBuilder.like(root.get("username"), "%"+firstname+"%");
        });
    }
}
