package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_form_master` (
  `form_id` int(11) NOT NULL,
  `form_field_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `form_field_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_feedback_message")
public class FormMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "form_id")
	private int formId;

	@Column(name = "form_field_id")
	private String formFieldId;
	
	@Column(name = "form_field_name")
	private String formFieldName;
	
	public FormMaster() {
		super();
	}
}
