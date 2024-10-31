package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_sub_community` (
  `id` int(11) NOT NULL,
  `community_id` int(11) NOT NULL,
  `sub_community_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class SubCommunityRequest {

	@NotBlank
	private int communityId;
	
	@NotBlank
	private int subCommunityName;

}
