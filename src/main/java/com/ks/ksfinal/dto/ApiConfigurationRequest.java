package com.ks.ksfinal.dto;
import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import com.fss.grameenpay.common.SwaggerConstants;
//import io.swagger.annotations.Ap.dtoProperty;

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

import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Validated
public class ApiConfigurationRequest {

//	@Ap.dtoProperty(example = SwaggerConstants.APINAME)
	@Size(min = 10, max = 200, message = "Api Name must be between 10 and 200 characters")
	private String apiName;

//	@Ap.dtoProperty(example = SwaggerConstants.AUTHENTICATIONTYPE)
	@NotBlank(message = "Field should not be blank")
	private String authenticationType;
	
//	@Ap.dtoProperty(example = SwaggerConstants.USERNAME)
	@NotBlank(message = "Field should not be blank")
	private String username;

	@NotBlank(message = "Field should not be blank")
	private String password;

//	@Ap.dtoProperty(example = SwaggerConstants.ACCESSTOKEN)
	@NotBlank(message = "Field should not be blank")
	private String accessToken;

//	@Ap.dtoProperty(example = SwaggerConstants.TOKENENDPOINT)
	@NotBlank(message = "Field should not be blank")
	private String tokenEndpoint;

//	@Ap.dtoProperty(example = SwaggerConstants.ENDPOINTNAME)
	@NotBlank(message = "Field should not be blank")
	private String endpointName;

//	@Ap.dtoProperty(example = SwaggerConstants.USEAS)
	@NotBlank(message = "Field should not be blank")
	private String useAs;
	
	@NotBlank(message = "Field should not be blank")
	private String errorHandling;

//	@Ap.dtoProperty(example = SwaggerConstants.DATATYPE)
	@NotBlank(message = "Field should not be blank")
	private String dataType;

//	@Ap.dtoProperty(example = SwaggerConstants.APIMETHOD)
	@NotBlank(message = "Field should not be blank")
	private String apiMethod;

//	@Ap.dtoProperty(example = SwaggerConstants.APIENDPOINTURL)
	@NotBlank(message = "Field should not be blank")
	private String apiEndpointUrl;

//	@Ap.dtoProperty(example = SwaggerConstants.HEADERS)
	@NotBlank(message = "Field should not be blank")
	private String headers;

//	@Ap.dtoProperty(example = SwaggerConstants.PARAMETERS)
	@NotBlank(message = "Field should not be blank")
	private String parameters;

//	@Ap.dtoProperty(example = SwaggerConstants.ACCEPT)
	@NotBlank(message = "Field should not be blank")
	private String accept;

//	@Ap.dtoProperty(example = SwaggerConstants.CONTENTTYPE)
	@NotBlank(message = "Field should not be blank")
	private String contentType;

	@NotBlank(message = "Field should not be blank")
	private String requestResponseConfigurable;
	
	@NotBlank(message = "Field should not be blank")
	private Date createdDate;

	@NotBlank(message = "Field should not be blank")
	private Date modifiedDate;

//	@Ap.dtoProperty(example = SwaggerConstants.CREATEDBY)
	@NotBlank(message = "Field should not be blank")
	private String createdBy;

//	@Ap.dtoProperty(example = SwaggerConstants.MODIFIEDBY)
	@NotBlank(message = "Field should not be blank")
	private String modifiedBy;

}
