package com.ks.ksfinal.model;
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
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_file")
public class UserFile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "img_type")
	private String imgType;
	
	@Column(name = "file_name")
	private String fileName;
	
	@Column(name = "path")
	private String path;
	
	@Column(name = "thumb")
	private String thumb;

	@Column(name = "profile_img")
	private int profileImg;
	
	@CreatedDate
	@Column(name = "upload_date")
	private Date uploadDate;
	
	public UserFile() {
		super();
	}
}
