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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import com.ks.ksfinal.model.composite.AdminAuthItemChildId;

/* CREATE TABLE `tbl_admin_auth_item_child` (
  `parent` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `child` varchar(64) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_admin_auth_item_child")
@IdClass(AdminAuthItemChildId.class)
public class AdminAuthItemChild {

	@Id
	@Column(name = "parent")
//	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private String parent;
	
	@Id
	@Column(name = "child")
//	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private String child;

	public AdminAuthItemChild() {
		super();
	}

}
