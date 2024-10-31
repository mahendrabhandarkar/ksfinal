/* CREATE TABLE `tbl_users` (
  `id` int(11) UNSIGNED NOT NULL,
  `username` varchar(50) COLLATE utf8_bin NOT NULL,
  `email` varchar(100) COLLATE utf8_bin NOT NULL,
  `mobile_no` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `profile_for` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `dob` bigint(20) DEFAULT NULL,
  `activated` tinyint(1) NOT NULL DEFAULT 1,
  `banned` tinyint(1) NOT NULL DEFAULT 0,
  `ban_reason` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `new_password_key` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `new_password_requested` datetime DEFAULT NULL,
  `new_email` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `new_email_key` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `last_ip` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `last_login` bigint(20) DEFAULT NULL,
  `firstname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `lastname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `auth_key` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_hash` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_reset_token` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` smallint(6) NOT NULL DEFAULT 10,
  `created_at` bigint(20) DEFAULT NULL,
  `updated_at` bigint(20) DEFAULT NULL,
  `verification_token` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 */
package com.ks.ksfinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UsersRequest {

	@NotNull(message = "username shouldn't be null")
	private String username;
	
	@Email(message = "invalid email address")
	private String email;
	
	@Min(0)
	@Max(1)
	private int status;

	@NotBlank
	private String verificationToken;

	@NotBlank
	private String authKey;

	@NotBlank
	private String passwordHash;
	
	@NotBlank
	private String passwordResetToken;

	private int createdAt;

	private int updatedAt;
	
	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public int getStatus() {
		return status;
	}

	public String getVerificationToken() {
		return verificationToken;
	}

	public String getAuthKey() {
		return authKey;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public String getPasswordResetToken() {
		return passwordResetToken;
	}

	public int getCreatedAt() {
		return createdAt;
	}

	public int getUpdatedAt() {
		return updatedAt;
	}
}
