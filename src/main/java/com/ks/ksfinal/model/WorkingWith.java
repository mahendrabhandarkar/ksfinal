package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_working_with` (
  `id` int(11) NOT NULL,
  `work_with` varchar(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_working_with")
public class WorkingWith {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "work_with")
	private String workWith;
	
	public WorkingWith() {
		super();
	}
}
