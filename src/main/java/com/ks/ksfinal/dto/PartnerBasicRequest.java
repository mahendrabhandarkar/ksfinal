package com.ks.ksfinal.dto;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_partner_basic` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `pcountry_id` int(11) NOT NULL,
  `pstate_id` int(11) NOT NULL,
  `pcity_id` int(11) NOT NULL,
  `pmtongue_id` int(11) NOT NULL,
  `pmarital_status` varchar(50) NOT NULL,
  `page` int(11) NOT NULL,
  `pageto` int(11) NOT NULL,
  `pheightto` int(11) NOT NULL,
  `pheight` int(11) NOT NULL,
  `pskin_tone` varchar(50) NOT NULL,
  `pbody_type` varchar(50) NOT NULL,
  `pdisability` varchar(50) NOT NULL,
  `phiv_positive` varchar(40) NOT NULL,
  `pprofile_complete` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class PartnerBasicRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "pcountry_id")
	private int pcountryId;
	
	@Column(name = "pstate_id")
	private int pstateId;
	
	@Column(name = "pcity_id")
	private int pcityId;
	
	@Column(name = "pmtongue_id")
	private int pmtongueId;
	
	@Column(name = "pmarital_status")
	private String pmaritalStatus;
	
	@Column(name = "page")
	private int page;
	
	@Column(name = "pageto")
	private int pageto;
	
	@Column(name = "pheightto")
	private int pheightto;
	
	@Column(name = "pheight")
	private int pheight;
	
	@Column(name = "pskin_tone")
	private String pskinTone;
	
	@Column(name = "pbody_type")
	private String pbodyType;
	
	@Column(name = "pdisability")
	private String pdisability;
	
	@Column(name = "phiv_positive")
	private String phivPositive;
	
	@Column(name = "pprofile_complete")
	private int pprofileComplete;
}
