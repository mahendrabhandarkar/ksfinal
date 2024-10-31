package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_lifestyle` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `diet` varchar(10) NOT NULL,
  `smoke` varchar(15) NOT NULL,
  `drink` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor()
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_lifestyle")
public class UserLifestyle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "diet")
	private String diet;
	
	@Column(name = "smoke")
	private String smoke;
	
	@Column(name = "drink")
	private String drink;
	
	public UserLifestyle() {
		super();
	}
}
