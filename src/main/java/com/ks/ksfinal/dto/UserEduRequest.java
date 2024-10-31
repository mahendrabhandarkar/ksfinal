package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_user_edu` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `edu_level_id` int(11) NOT NULL,
  `edu_field_id` int(11) NOT NULL,
  `work_with_id` int(11) NOT NULL,
  `work_as_id` int(11) NOT NULL,
  `annual_income` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserEduRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private int eduLevelId;
	
	@NotBlank(message = "Field should not be blank")
	private int eduFieldId;
	
	@NotBlank(message = "Field should not be blank")
	private int workWithId;
	
	@NotBlank(message = "Field should not be blank")
	private int workAsId;
	
	@Min(1)
    @Max(999999999)
	private int annualIncome;
}
