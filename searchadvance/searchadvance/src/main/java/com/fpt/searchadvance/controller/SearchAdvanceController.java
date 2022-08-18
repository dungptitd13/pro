package com.fpt.searchadvance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.searchadvance.request.SearchAdvancedRequest;
import com.fpt.searchadvance.service.SearchAdvanceService;

@RestController
public class SearchAdvanceController {

	@Autowired
	private SearchAdvanceService searchAdvanceService;

	@PostMapping
	public ResponseEntity<Object> searchAdvance(@RequestBody SearchAdvancedRequest advancedRequest) {
		return searchAdvanceService.searchAdvance(advancedRequest);
	}
}
