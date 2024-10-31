package com.ks.ksfinal.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<>();
		map.put("message", message);
		map.put("status", status.value());
		map.put("data", responseObj);

		return new ResponseEntity<>(map, status);
	}

	public static ResponseEntity<Object> generateErrorResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<>();
		map.put("errorMessage", message);
		map.put("errorCode", status.value());
		map.put("data", responseObj);

		return new ResponseEntity<>(map, status);
	}

	public static List<Object> generateListResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<>();
		map.put("message", message);
		map.put("status", status.value());
		map.put("data", responseObj);
		List<Object> listData = new ArrayList<>();
		listData.add(map);
		return listData;
	}

	private ResponseHandler() {
		throw new IllegalStateException("Response Handler");
	}

	public static ResponseEntity<Object> generateMockResponse(String message, HttpStatus status, Object responseObj) {
		Map<String, Object> map = new HashMap<>();

		map.put("data", responseObj);

		return new ResponseEntity<>(map, status);
	}

}
