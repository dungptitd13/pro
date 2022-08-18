package com.fpt.searchadvance.request;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SearchType {
	MATCH_ALL("MATCH_ALL", "AND (%s) "), MATCH_ONE("MATCH_ONE", "OR (%s) "), NOT_MATCH("NOT_MATCH", "<> (%s) "),
	ORTHER("ORTHER", null);
	@JsonValue
	private String name;
	private String value;
	
}
