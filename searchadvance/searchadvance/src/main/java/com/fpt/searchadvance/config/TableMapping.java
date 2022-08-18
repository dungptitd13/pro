package com.fpt.searchadvance.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "crts.app", ignoreUnknownFields = false)
@Data
@Component
public class TableMapping {
	private List<SceenSearch> webconsole;

	@Data
	public static class SceenSearch {
		private String screenId;
		private Map<String, String> column;
		private String from;
	}
}
