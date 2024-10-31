package com.ks.ksfinal.dto;
import java.util.Date;

import java.time.LocalDate; //(since Hibernate 5.2.3)
import java.time.LocalDateTime; //(since Hibernate 5.2.3)
import java.util.Date;
import java.util.Calendar;
import java.sql.Time;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/* CREATE TABLE `tbl_user_album` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `album_name` varchar(100) NOT NULL,
  `album_folder` varchar(100) NOT NULL,
  `album_create_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserAlbumRequest {

	@NotBlank
	private int userId;
	
	@NotBlank
	private String albumName;
	
	@NotBlank
	private String albumFolder;
	
	@NotBlank
	private Timestamp albumCreatedDate;

}
