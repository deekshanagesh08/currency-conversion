package com.ibm.currencyconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.ibm.currencyconversion.client.ConvertorClient;
@RestController
@RequestMapping("/currency-conversion")
public class CurrencyConversionController {
	@Autowired
	private ConvertorClient convertorClient;
	@GetMapping("/convertor")
	public ResponseEntity<JsonNode> getConversion() {
		return convertorClient.getAll();
	}
}