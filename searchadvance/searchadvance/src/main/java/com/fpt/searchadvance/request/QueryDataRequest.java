package com.fpt.searchadvance.request;

import lombok.Data;

@Data
public class QueryDataRequest {
	private String name;
	private ConditionalSql conditional;
	private String value;

	public String queryData() {
		return String.format(conditional.getValue(), this.name, this.value);
	}
}
