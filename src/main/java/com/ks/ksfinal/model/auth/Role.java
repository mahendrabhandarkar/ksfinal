package com.ks.ksfinal.model.auth;

import jakarta.persistence.*;
import lombok.Data;


/**
 * @author Test User
 */
@Entity
@Data
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private RoleType role;
}
