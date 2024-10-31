package com.ks.ksfinal.model;
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
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_1_product_type_master")
public class ProductTypeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_type_id")
	private int productTypeId;
	
	@Column(name = "product_type")
	private String productType;

//	@ApiModelProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_PRODUCTTYPEDESCRIPTION)
	@Column(name = "product_type_description")
	private String productTypeDescription;
	
	@CreatedDate
	@Column(name = "created_date")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date createdDate;
	
	@LastModifiedDate
	@Column(name = "modified_date")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date modifiedDate;
	
//	@ApiModelProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_CREATEDBY)
	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;
	
//	@ApiModelProperty(example = SwaggerConstants.PRODUCTTYPEMASTER_MODIFIEDBY)
	@LastModifiedBy
	@Column(name = "modified_by")
	private String modifiedBy;

	public ProductTypeMaster() {
		super();
	}

}
