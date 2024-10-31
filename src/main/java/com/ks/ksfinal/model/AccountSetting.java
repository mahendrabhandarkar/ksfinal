package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_account_setting` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `display_mobile` int(11) NOT NULL DEFAULT 1,
  `display_email` int(11) NOT NULL DEFAULT 1,
  `display_profile` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_account_setting")
public class AccountSetting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "display_mobile")
	private int displayMobile;
	
	@Column(name = "display_email")
	private int displayEmail;
	
	@Column(name = "display_profile")
	private int displayProfile;
	
	public AccountSetting() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDisplayMobile() {
		return displayMobile;
	}

	public void setDisplayMobile(int displayMobile) {
		this.displayMobile = displayMobile;
	}

	public int getDisplayEmail() {
		return displayEmail;
	}

	public void setDisplayEmail(int displayEmail) {
		this.displayEmail = displayEmail;
	}

	public int getDisplayProfile() {
		return displayProfile;
	}

	public void setDisplayProfile(int displayProfile) {
		this.displayProfile = displayProfile;
	}

}
