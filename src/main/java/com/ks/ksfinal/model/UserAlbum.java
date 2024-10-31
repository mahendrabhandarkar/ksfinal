package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate; //(since Hibernate 5.2.3)
import java.time.LocalDateTime; //(since Hibernate 5.2.3)
import java.util.Date;
import java.util.Calendar;
import java.sql.Time;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_user_album")
public class UserAlbum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "album_name")
	private String albumName;
	
	@Column(name = "album_folder")
	private String albumFolder;
	
	@CreationTimestamp
	@Column(name = "album_create_date")
	private Timestamp albumCreatedDate;
	
	public UserAlbum() {
		super();
	}
}
