package com.fpt.searchadvance.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fpt.searchadvance.config.TableMapping;
import com.fpt.searchadvance.request.QueryDataRequest;
import com.fpt.searchadvance.request.SearchAdvancedRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SearchAdvanceServiceImpl implements SearchAdvanceService {
	@Autowired
	private TableMapping tableMapping;

	@Override
	public ResponseEntity<Object> searchAdvance(SearchAdvancedRequest advancedRequest) {
		var searchType = advancedRequest.getSearchType();
		var screenConfig = tableMapping.getWebconsole().stream()
				.filter(t -> t.getScreenId().equals(advancedRequest.getScreenId())).findFirst().orElseThrow();
		StringBuilder sqlQuery = new StringBuilder();
		sqlQuery.append("SELECT ");
		Map<String, String> keyColum = screenConfig.getColumn();
		for (var entry : keyColum.entrySet()) {
			sqlQuery.append(entry.getValue() + " as " + entry.getKey());
		}
		sqlQuery.append("FROM ");
		sqlQuery.append(screenConfig.getFrom());
		sqlQuery.append("WHERE 1=1 ");
		List<QueryDataRequest> queryDatas = advancedRequest.getQueryData();
		for (QueryDataRequest queryData : queryDatas) {
			sqlQuery.append(String.format(searchType.getValue(), queryData.queryData()));
		}
		log.info(sqlQuery.toString());
		return ResponseEntity.ok(sqlQuery.toString());
	}

}
