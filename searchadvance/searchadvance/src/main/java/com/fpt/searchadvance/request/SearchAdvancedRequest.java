package com.fpt.searchadvance.request;

import java.util.List;

import lombok.Data;

@Data
public class SearchAdvancedRequest {
	private List<QueryDataRequest> queryData;
	private String screenId;
	private long limit;
	private long offset;
	private String sortKey;
	private String sortType;
	private SearchType searchType;
	private String conditionalExpression;
}
