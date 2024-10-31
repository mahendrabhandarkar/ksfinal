package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_user_lifestyle` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `diet` varchar(10) NOT NULL,
  `smoke` varchar(15) NOT NULL,
  `drink` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserLifestyleRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private String diet;
	
	@NotBlank(message = "Field should not be blank")
	private String smoke;
	
	@NotBlank(message = "Field should not be blank")
	private String drink;
}
