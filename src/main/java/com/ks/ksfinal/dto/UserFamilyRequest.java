package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_user_family` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `father_name` varchar(40) NOT NULL,
  `mother_name` varchar(40) NOT NULL,
  `father_status` varchar(60) NOT NULL,
  `mother_status` varchar(60) NOT NULL,
  `family_status` varchar(40) NOT NULL,
  `brother` int(11) NOT NULL,
  `sister` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserFamilyRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private String fatherName;
	
	@NotBlank(message = "Field should not be blank")
	private String motherName;
	
	@NotBlank(message = "Field should not be blank")
	private String fatherStatus;
	
	@NotBlank(message = "Field should not be blank")
	private String motherStatus;
	
	@NotBlank(message = "Field should not be blank")
	private String familyStatus;
	
	@NotBlank(message = "Field should not be blank")
	private int brother;
	
	@NotBlank(message = "Field should not be blank")
	private int sister;
}
