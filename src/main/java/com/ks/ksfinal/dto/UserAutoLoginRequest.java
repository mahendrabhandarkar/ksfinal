package com.ks.ksfinal.dto;
import java.sql.Timestamp;
import java.util.Date;

/* CREATE TABLE `tbl_user_autologin` (
  `key_id` char(32) COLLATE utf8_bin NOT NULL,
  `user_id` int(11) NOT NULL DEFAULT 0,
  `user_agent` varchar(150) COLLATE utf8_bin NOT NULL,
  `last_ip` varchar(40) COLLATE utf8_bin NOT NULL,
  `last_login` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserAutoLoginRequest {

	@NotBlank
	private int userId;
	
	@NotBlank
	private String userAgent;
	
	@NotBlank
	private String lastIp;
	
	@NotBlank
	private Timestamp lastLogin;

}
