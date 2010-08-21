package com.ant.oms.dao;

import com.ant.oms.entity.Setting;

public interface SettingDAO extends BaseDAO<Setting> {
	public static final String DEFAULT_NS = "DEFAULT";
	public Setting getSettingForKey(String key);
	public Setting getSettingForKey(String key, String namespace);
}
