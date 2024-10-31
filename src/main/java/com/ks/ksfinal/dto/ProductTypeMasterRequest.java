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

/* CREATE TABLE `tbl_1_product_type_master` (
  `product_type_id` int(11) NOT NULL,
  `product_type` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `product_type_description` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
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
public class ProductTypeMasterRequest {
	
	@NotBlank
	private String productType;

//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_PRODUCTTYPEDESCRIPTION)
	@NotBlank
	private String productTypeDescription;
	
	@NotBlank
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date createdDate;
	
	@NotBlank
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date modifiedDate;
	
//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_CREATEDBY)
	@NotBlank
	private String createdBy;
	
//	@Ap.dtoProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_MODIFIEDBY)
	@NotBlank
	private String modifiedBy;

}
