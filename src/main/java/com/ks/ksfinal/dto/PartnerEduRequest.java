package com.ks.ksfinal.dto;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_partner_edu` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `pedu_level_id` int(11) NOT NULL,
  `pedu_field_id` int(11) NOT NULL,
  `pwork_with_id` int(11) NOT NULL,
  `pwork_as_id` int(11) NOT NULL,
  `pannual_income` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class PartnerEduRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "pedu_level_id")
	private int peduLevelId;
	
	@Column(name = "pedu_field_id")
	private int peduFieldId;
	
	@Column(name = "pwork_with_id")
	private int pworkWithId;
	
	@Column(name = "pwork_as_id")
	private int pworkAsId;
	
	@Column(name = "pannual_income")
	private int pannualIncome;

}
