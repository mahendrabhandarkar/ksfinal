package com.ks.ksfinal.dto;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

/* CREATE TABLE `tbl_send_message` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `send_to` int(11) NOT NULL,
  `message` mediumtext NOT NULL,
  `date` varchar(20) NOT NULL,
  `view` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class SendMessageRequest {

	@NotBlank
	private int userId;
	
	@NotBlank
	private int sendTo;
	
	@NotBlank
	private String message;
	
	@NotBlank
	private String date;
	
	@NotBlank
	private int view;
}
