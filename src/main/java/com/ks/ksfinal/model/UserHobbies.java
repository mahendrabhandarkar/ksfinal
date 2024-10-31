package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_user_hobbies` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `hobbies` varchar(250) NOT NULL,
  `interests` varchar(250) NOT NULL,
  `fav_music` varchar(250) NOT NULL,
  `fav_books` varchar(250) NOT NULL,
  `pre_movies` varchar(250) NOT NULL,
  `cook_food` varchar(150) NOT NULL,
  `own_words` varchar(800) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity(name = "user_hobbies")
@Table(name = "tbl_user_hobbies")
public class UserHobbies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;

//	@JdbcTypeCode(SqlTypes.JSON)
//	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
 //   @PrimaryKeyJoinColumn(name = "user_id")
//	@JoinColumn(name="user_id")
//	private int userId;
	
	@Column(name = "hobbies")
	private String hobbies;
	
	@Column(name = "interests")
	private String interests;
	
	@Column(name = "fav_music")
	private String favMusic;
	
	@Column(name = "fav_books")
	private String favBooks;
	
	@Column(name = "pre_movies")
	private String preMovies;
	
	@Column(name = "cook_food")
	private String cookFood;
	
	@Column(name = "own_words")
	private String ownWords;
	
	public UserHobbies() {
		super();
	}
}
