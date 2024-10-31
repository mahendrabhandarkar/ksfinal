package com.ks.ksfinal.dto;
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

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AdminUserRequest {

	@NotBlank(message = "Field should not be blank")
	private String username;
	
	@NotBlank(message = "Field should not be blank")
	private String authKey;

	@NotBlank(message = "Field should not be blank")
	private String passwordHash;
	
	@NotBlank(message = "Field should not be blank")
	private String passwordResetToken;
	
	@Email(message = "invalid email address")
	private String email;
	
	@NotBlank(message = "Field should not be blank")
	private int status;

	@NotBlank(message = "Field should not be blank")
	private String verificationToken;
	
	@NotBlank(message = "Field should not be blank")
	private int createdAt;
	
	@NotBlank(message = "Field should not be blank")
	private int updatedAt;

}
