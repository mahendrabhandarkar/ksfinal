package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* CREATE TABLE `tbl_1_product_service` (
  `product_service_id` int(11) NOT NULL,
  `no_of_steps` int(11) DEFAULT NULL,
  `override` bit(1) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `service_name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `customer_selection_show` tinyint(1) DEFAULT 0,
  `service_image_path` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `service_status` int(11) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_1_product_service")
public class ProductService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_service_id")
	private int productServiceId;

	@Column(name = "no_of_steps")
	private int noOfSteps;
	
	@Column(name = "override")
	private Boolean Override;
	
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "service_name")
	private String serviceName;
	
	@Column(name = "customer_selection_show")
	private int customerSelectionShow;
	
	@Column(name = "service_image_path")
	private String serviceImagePath;
	
	@Column(name = "service_status")
	private int serviceStatus;
	
	public ProductService() {
		super();
	}

}
