package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_search` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `profile_img` int(11) NOT NULL,
  `marital_status` varchar(20) NOT NULL,
  `religion_id` int(11) NOT NULL,
  `mother_tongue_id` int(11) NOT NULL,
  `country_id` int(11) NOT NULL,
  `state_id` int(11) NOT NULL,
  `city_id` int(11) NOT NULL,
  `edu_id` int(11) NOT NULL,
  `diet` varchar(20) NOT NULL,
  `disability` varchar(20) NOT NULL,
  `hiv_positive` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_search")
public class UserSearch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "profile_img")
	private int profileImg;
	
	@Column(name = "marital_status")
	private int pheightto;
	
	@Column(name = "religion_id")
	private int religionId;
	
	@Column(name = "mother_tongue_id")
	private int motherTongueId;
	
	@Column(name = "country_id")
	private int countryId;
	
	@Column(name = "state_id")
	private int stateId;
	
	@Column(name = "city_id")
	private int cityId;
	
	/*
	 * @Column(name = "height") private int height;
	 * 
	 * @Column(name = "skin_tone") private String skinTone;
	 */
	
	@Column(name = "edu_id")
	private String eduId;

	@Column(name = "diet")
	private String diet;
	
	@Column(name = "disability")
	private String disability;
	
	@Column(name = "hiv_positive")
	private String hivPositive;
	
	public UserSearch() {
		super();
	}
}
