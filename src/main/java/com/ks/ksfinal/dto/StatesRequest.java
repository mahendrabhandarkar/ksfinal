package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_states` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `country_id` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StatesRequest {

	@NotBlank
	private String name;
	
	@NotBlank
	private int countryId;

}
