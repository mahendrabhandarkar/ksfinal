package com.ks.ksfinal.model;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import com.fss.grameenpay.common.SwaggerConstants;
//import io.swagger.annotations.ApiModelProperty;

// CREATE TABLE `tbl_1_api_configuration` (
//   `api_configuration_id` int(11) NOT NULL,
//   `api_name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `authentication_type` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `username` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `password` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `access_token` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `token_endpoint` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `endpoint_name` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `use_as` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `error_handling` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`error_handling`)),
//   `data_type` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `api_method` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
//   `api_endpoint_url` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
//   `headers` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`headers`)),
//   `parameters` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`parameters`)),
//   `accept` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `content_type` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `created_date` timestamp NULL DEFAULT current_timestamp(),
//   `modified_date` timestamp NULL DEFAULT current_timestamp(),
//   `created_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `modified_by` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//   `request_response_configurable` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`request_response_configurable`))
// )
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
@Entity
@Table(name = "tbl_1_api_configuration")
public class ApiConfiguration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "api_configuration_id")
	private int apiConfigurationId;

//	@ApiModelProperty(example = SwaggerConstants.APINAME)
	@Column(name = "api_name")
	private String apiName;

//	@ApiModelProperty(example = SwaggerConstants.AUTHENTICATIONTYPE)
	@Column(name = "authentication_type")
	private String authenticationType;
	
//	@ApiModelProperty(example = SwaggerConstants.USERNAME)
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

//	@ApiModelProperty(example = SwaggerConstants.ACCESSTOKEN)
	@Column(name = "access_token")
	private String accessToken;

//	@ApiModelProperty(example = SwaggerConstants.TOKENENDPOINT)
	@Column(name = "token_endpoint")
	private String tokenEndpoint;

//	@ApiModelProperty(example = SwaggerConstants.ENDPOINTNAME)
	@Column(name = "endpoint_name")
	private String endpointName;

//	@ApiModelProperty(example = SwaggerConstants.USEAS)
	@Column(name = "use_as")
	private String useAs;
	
//	@Column(name = "error_handling", columnDefinition = "json")
	@Column(name = "error_handling")
	private String errorHandling;

//	@ApiModelProperty(example = SwaggerConstants.DATATYPE)
	@Column(name = "data_type")
	private String dataType;

//	@ApiModelProperty(example = SwaggerConstants.APIMETHOD)
	@Column(name = "api_method")
	private String apiMethod;

//	@ApiModelProperty(example = SwaggerConstants.APIENDPOINTURL)
	@Column(name = "api_endpoint_url")
	private String apiEndpointUrl;

//	@ApiModelProperty(example = SwaggerConstants.HEADERS)
//	@Column(name = "headers", columnDefinition = "json")
	@Column(name = "headers")
	private String headers;

//	@ApiModelProperty(example = SwaggerConstants.PARAMETERS)
//	@Column(name = "parameters", columnDefinition = "json")
	@Column(name = "parameters")
	private String parameters;

//	@ApiModelProperty(example = SwaggerConstants.ACCEPT)
	@Column(name = "accept")
	private String accept;

//	@ApiModelProperty(example = SwaggerConstants.CONTENTTYPE)
	@Column(name = "content_type")
	private String contentType;

//	@Column(name = "request_response_configurable", columnDefinition = "json")
	@Column(name = "request_response_configurable")
	private String requestResponseConfigurable;
	
	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

	@LastModifiedDate
	@Column(name = "modified_date")
	private Date modifiedDate;

//	@ApiModelProperty(example = SwaggerConstants.CREATEDBY)
	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

//	@ApiModelProperty(example = SwaggerConstants.MODIFIEDBY)
	@LastModifiedBy
	@Column(name = "modified_by")
	private String modifiedBy;

	public ApiConfiguration() {
		super();
	}

}
