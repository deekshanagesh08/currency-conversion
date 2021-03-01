package com.ibm.currencyconversion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.JsonNode;

@FeignClient(name = "CONVERTOR")
public interface ConvertorClient {

	@RequestMapping(value = "/currency/conversion", produces = {"*/*"}, method = RequestMethod.GET)
	ResponseEntity<JsonNode> getAll();
}
