package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.ks.ksfinal.model.composite.AdminAuthAssignmentId;

/* CREATE TABLE `tbl_admin_auth_assignment` (
  `item_name` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `user_id` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_admin_auth_assignment")
@IdClass(AdminAuthAssignmentId.class)
public class AdminAuthAssignment {

	@Id
	@Column(name = "item_name")
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinTable(name = "tbl_admin_auth_assignment", 
	joinColumns = { // linked table fieldname
			@JoinColumn(name="item_name"),
		}, 
	inverseJoinColumns = { // same table
			@JoinColumn(name="name"),
		})
	private String itemName;

	@Id
	@Column(name = "user_id")
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private String userId;
	
	@Column(name = "created_at")
	private int createdAt;
	
	public AdminAuthAssignment() {
		super();
	}

}
