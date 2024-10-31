package com.ks.ksfinal.model;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_admin_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `auth_key` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `password_hash` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password_reset_token` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT 10,
  `created_at` int(11) NOT NULL,
  `updated_at` int(11) NOT NULL,
  `verification_token` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_admin_user")
public class AdminUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private int id;

	@Column(name = "username")
	private String username;
	
	@Column(name = "auth_key")
	private String authKey;

	@Column(name = "password_hash")
	private String passwordHash;
	
	@Column(name = "password_reset_token")
	private String passwordResetToken;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "status")
	private int status;

	@Column(name = "verification_token")
	private String verificationToken;
	
	@CreatedDate
	@Column(name = "created_at")
	private int createdAt;
	
	@LastModifiedDate
	@Column(name = "updated_at")
	private int updatedAt;
	
	public AdminUser() {
		super();
	}

}
