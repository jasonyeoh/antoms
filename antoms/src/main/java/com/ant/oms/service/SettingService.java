package com.ant.oms.service;

import com.ant.oms.entity.Setting;

public interface SettingService {
	public String getValue(String key);
	public String getValue(String key, String namespace);
	public String[] getValues(String key);
	public String[] getValues(String key, String namespace);
	public Setting create(String key, String namespace, String... values);
	public boolean update(Setting setting); 
}
