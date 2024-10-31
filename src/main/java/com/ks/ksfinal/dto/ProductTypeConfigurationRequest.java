package com.ks.ksfinal.dto;
import java.util.Date;

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

/* CREATE TABLE `tbl_1_product_type_configuration` (
  `product_type_configuration_id` int(11) NOT NULL,
  `product_type_id` int(11) NOT NULL,
  `product_type_configurable_columns` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`product_type_configurable_columns`)),
  `created_date` timestamp NULL DEFAULT current_timestamp(),
  `modified_date` timestamp NULL DEFAULT current_timestamp(),
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
public class ProductTypeConfigurationRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_type_configuration_id")
	private int productTypeConfigurationId;

//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPECCOFIGURATION_PRODUCTTYPEID)
	@Column(name = "product_type_id")
	private int productTypeId;

//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPECCOFIGURATION_PRODUCTTYPECONFIGURABLECOLUMNS)
	@Column(name = "product_type_configurable_columns", columnDefinition = "json")
	private String productTypeConfigurableColumns;
	
	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

	@LastModifiedDate
	@Column(name = "modified_date")
	private Date modifiedDate;

//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPECCOFIGURATION_CREATEDBY)
	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPECCOFIGURATION_MODIFIEDBY)
	@LastModifiedBy
	@Column(name = "modified_by")
	private String modifiedBy;

}
