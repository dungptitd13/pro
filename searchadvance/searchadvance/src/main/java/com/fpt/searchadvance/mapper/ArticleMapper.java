package com.fpt.searchadvance.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleMapper {
	@Select("SELECT * FROM ARTICLES WHERE 1=1 ${id}")
	Map<String, Object> getArticle(String id);
}
