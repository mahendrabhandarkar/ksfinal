package com.ks.ksfinal.model;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.ks.ksfinal.model.composite.AuthAssignmentId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.IdClass;
/* CREATE TABLE `tbl_auth_assignment` (
  `item_name` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_auth_assignment")
@IdClass(AuthAssignmentId.class)
public class AuthAssignment {

	@Id
	@Column(name = "item_name")
	private String itemName;

	@Id
	@Column(name = "user_id")
	private String userId;
	
	@CreatedDate
	@Column(name = "created_at")
	private int createdAt;

	public AuthAssignment() {
		super();
	}

}
