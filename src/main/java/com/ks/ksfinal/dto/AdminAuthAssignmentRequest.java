package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_admin_auth_assignment` (
  `item_name` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class AdminAuthAssignmentRequest {
	@NotBlank(message = "Field should not be blank")
	private String itemName;
	@NotBlank(message = "Field should not be blank")
	private String userId;
	@NotBlank(message = "Field should not be blank")
	private int createdAt;

}
