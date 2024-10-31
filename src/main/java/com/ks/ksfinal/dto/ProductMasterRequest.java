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

/* CREATE TABLE `tbl_1_product_master` (
  `product_id` int(11) NOT NULL,
  `product_type_id` int(11) NOT NULL,
  `product_name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `product_description` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_date` timestamp NULL DEFAULT current_timestamp(),
  `modified_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT current_timestamp(),
  `product_feature` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `image_path` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `kyc_required` int(11) DEFAULT 0,
  `isagentlogin_required` int(11) DEFAULT 0,
  `product_details_image` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `product_header_logo` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `product_service` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `isencryption_required` bit(1) DEFAULT NULL,
  `ekyc_service` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductMasterRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "product_type_id")
	private int productTypeId;
	
	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "product_feature")
	private String productFeature;
	
	@Column(name = "image_path")
	private String imagePath;

	@Column(name = "kyc_required")
	private int kycRequired;
	
	@Column(name = "isagentlogin_required")
	private int isagentloginRequired;
	
	@Column(name = "product_details_image")
	private String productDetailsImage;
	
	@Column(name = "product_header_logo")
	private String productHeaderLogo;

	@Column(name = "product_service")
	private String productService;
	
	@Column(name = "isencryption_required")
	private int isEncryptionRequired;

	@Column(name = "ekyc_service")
	private int ekycService;

	@CreatedDate
	@Column(name = "created_date")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date createdDate;

	@LastModifiedDate
	@Column(name = "modified_date")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date modifiedDate;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;
	
	@LastModifiedBy
	@Column(name = "modified_by")
	private String modifiedBy;

}
