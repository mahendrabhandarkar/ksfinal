package com.ks.ksfinal.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// CREATE TABLE `tbl_1_product_api_configuration` (
//   `api_configuration_id` int(11) NOT NULL,
//   `product_configuration_id` int(11) NOT NULL,
//   `refering_product_service_id` int(11) DEFAULT NULL
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_1_product_api_configuration")
public class ProductApiConfiguration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_configuration_id")
	private int productConfigurationId;
	
	@Column(name = "api_configuration_id")
	private int apiConfigurationId;
	
	@Column(name = "refering_product_service_id")
	private int referingProductServiceId;

	public ProductApiConfiguration() {
		super();
	}

}
