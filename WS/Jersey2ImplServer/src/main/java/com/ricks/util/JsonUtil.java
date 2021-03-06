package com.ricks.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static <T> T convertJsonToJava(String jsonText, Class<T> clazz) {
		T response = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			response = mapper.readValue(jsonText, clazz);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	public static String convertJavaToJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonText = "";
		try {
			jsonText = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonText;

	}

}
