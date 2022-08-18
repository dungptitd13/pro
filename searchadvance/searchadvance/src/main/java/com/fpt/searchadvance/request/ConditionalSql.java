package com.fpt.searchadvance.request;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ConditionalSql {
	EQUAL("EQUAL", "%s = '%s'"), NOT_EQUAL("NOT_EQUAL", "%s <> '%s'"), START_WITH("START_WITH", "%s like '%s%'"),
	END_WITH("END_WITH", "%s like '%%s'"), MATCH_PARTIALLY("MATCH_PARTIALLY", "%s like %%s%"),
	NOT_MATCH("NOT_MATCH", "%s not like '%%s%'"), EXACT_WORD("EXACT_WORD", "%s regexp '[[:<:]]%s[[:>:]]';"),
	LESS_THAN("LESS_THAN", "%s < '%s'"), GREATER_THAN("GREATER_THAN", "%s > '%s'"), LESS_THAN_AND_EQUAL("LESS_THAN_AND_EQUAL", "%s <= '%s'"),
	GREATER_THAN_AND_EQUAL("GREATER_THAN_AND_EQUAL", "%s >= '%s'"), NOT_NULL("NOT_NULL", "%s IS NOT NULL"),
	NULL("NULL", "%s IS NULL");
	@JsonValue
	private String name;
	private String value;
}
