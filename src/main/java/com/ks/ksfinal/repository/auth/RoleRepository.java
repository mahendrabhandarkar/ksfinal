package com.ks.ksfinal.repository.auth;

import com.ks.ksfinal.model.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Test User
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
