package com.ks.ksfinal.dto;
import java.util.Date;

/* CREATE TABLE `tbl_userfolder` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `folder_name` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserFolderRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private String folderName;
}
