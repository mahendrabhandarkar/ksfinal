package com.ks.ksfinal.dto;
import java.util.Date;

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

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserHobbiesRequest {

	@NotBlank(message = "Field should not be blank")
	private int userId;
	
	@NotBlank(message = "Field should not be blank")
	private String hobbies;
	
	@NotBlank(message = "Field should not be blank")
	private String interests;
	
	@NotBlank(message = "Field should not be blank")
	private String favMusic;
	
	@NotBlank(message = "Field should not be blank")
	private String favBooks;
	
	@NotBlank(message = "Field should not be blank")
	private String preMovies;
	
	@NotBlank(message = "Field should not be blank")
	private String cookFood;
	
	@NotBlank(message = "Field should not be blank")
	private String ownWords;

}
