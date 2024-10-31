package com.ks.ksfinal.model;
import java.time.OffsetDateTime;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
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
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "tbl_1_asset_upload")
public class AssetUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "layout_id")
	private int layoutId;

	@Column(name = "layout_name")
	private String layoutName;

	@Column(name = "image_name")
	private String imageName;

	@Column(name = "image_path")
	private String imagePath;

	@Column(name = "layout_status")
	private boolean layoutStatus;
	
	@Column(name = "option_description")
	private String optionDescription;

	@CreatedDate 
	@Column(name = "created_date", nullable = false, updatable = false)
	private OffsetDateTime createdDate;

	@LastModifiedDate 
	@Column(name = "modified_date", nullable = false)
	private OffsetDateTime modifiedDate;

	@CreatedBy
	@Column(name = "created_by", nullable = false, updatable = false)
	private String createdBy;

	@LastModifiedBy
	@Column(name = "modified_by", nullable = false)
	private String modifiedBy;

	public int getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(int layoutId) {
		this.layoutId = layoutId;
	}

	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isLayoutStatus() {
		return layoutStatus;
	}

	public void setLayoutStatus(boolean layoutStatus) {
		this.layoutStatus = layoutStatus;
	}

	public String getOptionDescription() {
		return optionDescription;
	}

	public void setOptionDescription(String optionDescription) {
		this.optionDescription = optionDescription;
	}
	
	public AssetUpload() {
		super();
	}

}
