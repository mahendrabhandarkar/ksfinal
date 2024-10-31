package com.ks.ksfinal.converter;

import java.util.List;

import jakarta.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ks.ksfinal.model.json.JsonItem;

public class JsonItemConverter implements AttributeConverter<List<JsonItem>, String> {
	
	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();

	}

	@Override
	public String convertToDatabaseColumn(List<JsonItem> attribute) {
		try {
			return mapper.writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			return null;
		}
	}

	@Override
	public List<JsonItem> convertToEntityAttribute(String dbData) {
		try {
			return mapper.readValue(dbData,new TypeReference<List<JsonItem>>() {});
		} catch (Exception e) {
			return null;
		}
	}
	
}
