package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_profiles` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `website` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `mother_tongue_id` int(11) DEFAULT NULL,
  `religion_id` int(11) DEFAULT 0,
  `country_id` int(11) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `city_id` int(11) DEFAULT NULL,
  `marital_status` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `height` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `skin_tone` varchar(15) COLLATE utf8_bin DEFAULT '0',
  `body_type` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `diet` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `smoke` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `drink` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `own_words` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `disability` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `hiv_positive` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `profile_complete` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor()
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_profiles")
public class UserProfiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "website")
	private String website;
	
	@Column(name = "mother_tongue_id")
	private int motherTongueId;
	
	@Column(name = "religion_id")
	private int religionId;
	
	@Column(name = "country_id")
	private int countryId;
	
	@Column(name = "state_id")
	private int stateId;
	
	@Column(name = "city_id")
	private int cityId;

	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "height")
	private int height;
	
	@Column(name = "skin_tone")
	private String skinTone;
	
	@Column(name = "body_type")
	private String bodyType;
	
	@Column(name = "diet")
	private String diet;
	
	@Column(name = "smoke")
	private String smoke;
	
	@Column(name = "drink")
	private String drink;
	
	@Column(name = "own_words")
	private String ownWords;
	
	@Column(name = "disability")
	private String disability;
	
	@Column(name = "hiv_positive")
	private String hivPositive;
	
	@Column(name = "profile_complete")
	private int profileComplete;

	public UserProfiles() {
		super();
	}
}
