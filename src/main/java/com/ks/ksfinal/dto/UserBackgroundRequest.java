package com.ks.ksfinal.dto;
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

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserBackgroundRequest {

	@NotBlank
	private int userId;

	@NotBlank
	private int religionId;
	
	@NotBlank
	private int communityId;
	
	@NotBlank
	private String subCommunity;

	@NotBlank
	private int bcomplete;

}
