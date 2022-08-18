package com.fpt.searchadvance.service;

import org.springframework.http.ResponseEntity;

import com.fpt.searchadvance.request.SearchAdvancedRequest;

public interface SearchAdvanceService {
	public ResponseEntity<Object> searchAdvance(SearchAdvancedRequest advancedRequest);
}
