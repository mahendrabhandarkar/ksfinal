package com.ks.ksfinal.dto;
import java.util.Date;

import org.hibernate.annotations.Type;
//import org.hibernate.annotations.TypeDef;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* 
CREATE TABLE `tbl_1_product_configuration` (
  `product_configuration_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `product_service_id` int(11) NOT NULL,
  `product_configurable_columns` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`product_configurable_columns`)),
  `api_call` char(1) COLLATE utf8mb4_unicode_ci DEFAULT 'Y',
  `redirect` char(1) COLLATE utf8mb4_unicode_ci DEFAULT 'N',
  `batch` char(1) COLLATE utf8mb4_unicode_ci DEFAULT 'N',
  `display_to_customer` char(1) COLLATE utf8mb4_unicode_ci DEFAULT 'N',
  `step` int(11) NOT NULL,
  `store_in_db` tinyint(1) DEFAULT NULL,
  `created_date` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT current_timestamp(),
  `modified_date` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT current_timestamp(),
  `created_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `modified_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductConfigurationRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_configuration_id")
	private int productConfigurationId;

	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_service_id")
	private int productServiceId;

	@Column(name = "product_configurable_columns", columnDefinition = "json")
//	@Type(type = "json")
	private String productConfigurableColumns;

	@Column(name = "api_call")
	private String apiCall;

	@Column(name = "redirect")
	private String redirect;

	@Column(name = "batch")
	private String batch;

	@Column(name = "display_to_customer")
	private String displayToCustomer;

	@Column(name = "step")
	private int step;

	@Column(name = "store_in_db")
	private boolean storeInDb;

	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

	@LastModifiedDate
	@Column(name = "modified_date")
	private Date modifiedDate;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

	@LastModifiedBy
	@Column(name = "modified_by")
	private String modifiedBy;

}
