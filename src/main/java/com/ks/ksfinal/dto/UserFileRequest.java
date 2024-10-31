package com.ks.ksfinal.dto;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_file` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `img_type` varchar(30) NOT NULL,
  `file_name` varchar(2) NOT NULL,
  `path` varchar(100) NOT NULL,
  `thumb` mediumblob NOT NULL,
  `profile_img` int(11) NOT NULL,
  `upload_date` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserFileRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private String imgType;
	
	@NotBlank(message = "Field should not be blank")
	private String fileName;
	
	@NotBlank(message = "Field should not be blank")
	private String path;
	
	@NotBlank(message = "Field should not be blank")
	private String thumb;

	@NotBlank(message = "Field should not be blank")
	private int profileImg;
	
	@NotBlank(message = "Field should not be blank")
	private Date uploadDate;
}
