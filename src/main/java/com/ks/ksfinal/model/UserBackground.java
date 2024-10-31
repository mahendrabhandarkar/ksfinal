package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_background` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `religion_id` int(11) NOT NULL,
  `community_id` int(11) NOT NULL,
  `sub_community` varchar(100) NOT NULL,
  `bcomplete` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_background")
public class UserBackground {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "religion_id")
	private int religionId;
	
	@Column(name = "community_id")
	private int communityId;
	
	@Column(name = "sub_community")
	private String subCommunity;

	@Column(name = "bcomplete")
	private int bcomplete;
	
	public UserBackground() {
		super();
	}
}
