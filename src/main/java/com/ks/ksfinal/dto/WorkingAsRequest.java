package com.ks.ksfinal.dto;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_working_as` (
  `id` int(11) NOT NULL,
  `work_as` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class WorkingAsRequest {

	@NotBlank(message = "Field should not be blank")
	private String workAs;
}
