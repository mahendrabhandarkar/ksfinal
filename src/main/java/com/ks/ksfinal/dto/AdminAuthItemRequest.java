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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_admin_auth_item` (
  `name` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `type` smallint(6) NOT NULL,
  `description` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `rule_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `data` blob DEFAULT NULL,
  `created_at` int(11) DEFAULT NULL,
  `updated_at` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AdminAuthItemRequest {
	@NotBlank(message = "Field should not be blank")
	private String name;
	
	@NotBlank(message = "Field should not be blank")
	private int type;
	
	@NotBlank(message = "Field should not be blank")
	private String description;
	
	@NotBlank(message = "Field should not be blank")
	private String ruleName;
	
	@NotBlank(message = "Field should not be blank")
	private byte[] data;
	
	@NotBlank(message = "Field should not be blank")
	private int createdAt;
	
	@NotBlank(message = "Field should not be blank")
	private int updatedAt;

}
