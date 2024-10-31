package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_partner_background` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `preligion_id` int(11) NOT NULL,
  `pcommunity_id` int(11) NOT NULL,
  `psub_community` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_partner_background")
public class PartnerBackground {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "preligion_id")
	private int preligionId;
	
	@Column(name = "pcommunity_id")
	private int pcommunityId;
	
	@Column(name = "psub_community")
	private String psubCommunity;
	
	public PartnerBackground() {
		super();
	}
}
