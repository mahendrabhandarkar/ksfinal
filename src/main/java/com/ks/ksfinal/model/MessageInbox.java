package com.ks.ksfinal.model;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_message_inbox` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `from_to` int(11) NOT NULL,
  `message` mediumtext NOT NULL,
  `date` varchar(20) NOT NULL,
  `view` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_message_inbox")
public class MessageInbox {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "from_to")
	private int fromTo;
	
	@Column(name = "message")
	private String message;
	
	@CreatedDate 
	@Column(name = "date")
	private String date;
	
	@Column(name = "view")
	private int view;
	
	public MessageInbox() {
		super();
	}
}
