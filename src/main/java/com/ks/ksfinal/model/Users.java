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

package com.ks.ksfinal.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "users")
@Table(name = "tbl_users")
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Builder(setterPrefix = "with")
public class Users extends RepresentationModel<Users> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "status")
	private int status;

	@Column(name = "verification_token")
	private String verificationToken;

	@Column(name = "auth_key")
	private String authKey;

	@Column(name = "password_hash")
	private String passwordHash;
	
	@Column(name = "password_reset_token")
	private String passwordResetToken;
	
	@CreatedDate
	@Column(name = "created_at")
	private int createdAt;
	
	@LastModifiedDate
	@Column(name = "updated_at")
	private int updatedAt;
	
 //   @OneToMany(mappedBy = "userId", fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
 @JdbcTypeCode(SqlTypes.JSON)
 private List<UserHobbies> userHobbies = null;
    
	public Users() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getVerificationToken() {
		return verificationToken;
	}

	public void setVerificationToken(String verificationToken) {
		this.verificationToken = verificationToken;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordResetToken() {
		return passwordResetToken;
	}

	public void setPasswordResetToken(String passwordResetToken) {
		this.passwordResetToken = passwordResetToken;
	}

	public int getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}

	public int getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(int updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	public void prePersistBeforeAdd() {
		System.out.println("Pre Before Add");
	}
	@PostPersist
	public void postPersistBeforeAdd() {
		System.out.println("Post Before Add");
	}
	@PreUpdate
	public void prePersistAfterUpdate() {
		System.out.println("Pre After Update");
	}
	@PostUpdate
	public void postPersistAfterUpdate() {
		System.out.println("Post After Update");
	}
}
