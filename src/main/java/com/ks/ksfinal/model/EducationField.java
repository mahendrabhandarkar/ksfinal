package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_education_field` (
  `id` int(11) NOT NULL,
  `edu_field` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_education_field")
public class EducationField {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "edu_field")
	private String eduField;
	
	public EducationField() {
		super();
	}
}
