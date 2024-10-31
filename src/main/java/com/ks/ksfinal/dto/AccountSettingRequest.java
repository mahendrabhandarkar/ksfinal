package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_account_setting` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `display_mobile` int(11) NOT NULL DEFAULT 1,
  `display_email` int(11) NOT NULL DEFAULT 1,
  `display_profile` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AccountSettingRequest {

	@NotNull(message = "userId shouldn't be null")
	private int userId;
	
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private int displayMobile;
	
	@Email(message = "invalid email address")
	private int displayEmail;
	
	@NotBlank(message = "Field should not be blank")
	private int displayProfile;

}
