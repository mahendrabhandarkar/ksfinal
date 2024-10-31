package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_family` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `father_name` varchar(40) NOT NULL,
  `mother_name` varchar(40) NOT NULL,
  `father_status` varchar(60) NOT NULL,
  `mother_status` varchar(60) NOT NULL,
  `family_status` varchar(40) NOT NULL,
  `brother` int(11) NOT NULL,
  `sister` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_family")
public class UserFamily {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "mother_name")
	private String motherName;
	
	@Column(name = "father_status")
	private String fatherStatus;
	
	@Column(name = "mother_status")
	private String motherStatus;
	
	@Column(name = "family_status")
	private String familyStatus;
	
	@Column(name = "brother")
	private int brother;
	
	@Column(name = "sister")
	private int sister;
	
	public UserFamily() {
		super();
	}
}
