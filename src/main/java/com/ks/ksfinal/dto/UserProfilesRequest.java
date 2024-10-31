package com.ks.ksfinal.dto;
import java.util.Date;

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

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserProfilesRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;

	@NotBlank(message = "Field should not be blank")
	private String website;
	
	@NotBlank(message = "Field should not be blank")
	private int motherTongueId;
	
	@NotBlank(message = "Field should not be blank")
	private int religionId;
	
	@NotBlank(message = "Field should not be blank")
	private int countryId;
	
	@NotBlank(message = "Field should not be blank")
	private int stateId;
	
	@NotBlank(message = "Field should not be blank")
	private int cityId;

	@NotBlank(message = "Field should not be blank")
	private String maritalStatus;
	
	@NotBlank(message = "Field should not be blank")
	private int height;
	
	@NotBlank(message = "Field should not be blank")
	private String skinTone;
	
	@NotBlank(message = "Field should not be blank")
	private String bodyType;
	
	@NotBlank(message = "Field should not be blank")
	private String diet;
	
	@NotBlank(message = "Field should not be blank")
	private String smoke;
	
	@NotBlank(message = "Field should not be blank")
	private String drink;
	
	@NotBlank(message = "Field should not be blank")
	private String ownWords;
	
	@NotBlank(message = "Field should not be blank")
	private String disability;
	
	@NotBlank(message = "Field should not be blank")
	private String hivPositive;
	
	@NotBlank(message = "Field should not be blank")
	private int profileComplete;
}
