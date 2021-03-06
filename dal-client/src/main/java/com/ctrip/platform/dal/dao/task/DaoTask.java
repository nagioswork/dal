package com.ctrip.platform.dal.dao.task;

import java.util.List;
import java.util.Map;

import com.ctrip.platform.dal.dao.DalParser;

public interface DaoTask<T> {
	void initialize(DalParser<T> parser);
	void initTaskSettings(Map<String, String> settings);
	List<Map<String, ?>> getPojosFields(List<T> daoPojos);
}
