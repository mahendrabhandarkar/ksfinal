package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_edu` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `edu_level_id` int(11) NOT NULL,
  `edu_field_id` int(11) NOT NULL,
  `work_with_id` int(11) NOT NULL,
  `work_as_id` int(11) NOT NULL,
  `annual_income` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_edu")
public class UserEdu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "edu_level_id")
	private int eduLevelId;
	
	@Column(name = "edu_field_id")
	private int eduFieldId;
	
	@Column(name = "work_with_id")
	private int workWithId;
	
	@Column(name = "work_as_id")
	private int workAsId;
	
	@Column(name = "annual_income")
	private int annualIncome;
	
	public UserEdu() {
		super();
	}
}
