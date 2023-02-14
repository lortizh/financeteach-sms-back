package com.financeteach.sms.back.payload.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

	public static ResponseEntity<Object> generateResponse(String message, int code, HttpStatus status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Code:", code);
		map.put("status:", message);		
		return new ResponseEntity<Object>(map, status);
	}
}
