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

// CREATE TABLE `tbl_1_asset_upload` (
//   `layout_id` int(11) NOT NULL,
//   `layout_name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `image_name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `image_path` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `layout_status` tinyint(1) DEFAULT 0,
//   `option_description` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `created_date` timestamp NULL DEFAULT current_timestamp(),
//   `modified_date` timestamp NULL DEFAULT current_timestamp(),
//   `created_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `modified_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AssetUploadRequest {

	@NotBlank(message = "Field should not be blank")
	private String layoutName;

	@NotBlank(message = "Field should not be blank")
	private String imageName;

	@NotBlank(message = "Field should not be blank")
	private String imagePath;

	@NotBlank(message = "Field should not be blank")
	private boolean layoutStatus;
	
	@NotBlank(message = "Field should not be blank")
	private String optionDescription;

	@NotBlank(message = "Field should not be blank")
	private Date createdDate;

	@NotBlank(message = "Field should not be blank")
	private Date modifiedDate;

	@NotBlank(message = "Field should not be blank")
	private String createdBy;

	@NotBlank(message = "Field should not be blank")
	private String modifiedBy;

}
