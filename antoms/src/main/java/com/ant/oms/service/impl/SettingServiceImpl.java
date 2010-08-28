package com.ant.oms.service.impl;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.SettingDAO;
import com.ant.oms.entity.Setting;
import com.ant.oms.service.SettingService;
@Service
public class SettingServiceImpl extends BaseServiceImpl implements SettingService{
	
	@Autowired
	private SettingDAO dao;
	
	@Override
	public String getValue(String key) {
		return getValue(key, null);
	}

	@Override
	public String getValue(String key, String namespace) {
		check(key, "key-not-null");
		Setting s = dao.getSettingForKey(key, (namespace==null)?SettingDAO.DEFAULT_NS:namespace);
		if(s == null)
			throw new RuntimeException("???key-not-present???");
		return s.getValue();
	}

	@Override
	public String[] getValues(String key) {
		return getValues(key, null);
	}

	@Override
	public String[] getValues(String key, String namespace) {
		check(key, "key-not-null");
		Setting s = dao.getSettingForKey(key, (namespace==null)?SettingDAO.DEFAULT_NS:namespace);
		if(s == null)
			throw new RuntimeException("???key-not-present???");
		if(s.getValue().startsWith("[") && s.getValue().endsWith("]")){
			JSONArray arr = (JSONArray)JSONValue.parse(s.getValue());
			return (String [])arr.toArray();
		}
		throw new RuntimeException("???not-multiple-values???");
	}
	private void check(String key, String msgkey){
		if(key == null || key.equals("")){
			throw new RuntimeException("???"+msgkey+"????");
		}
	}

	@Override
	public Setting create(String key, String namespace, String... values) {
		Setting s = new Setting();
		check(key, "???key-not-present???");
		s.setKey(key);
		if(namespace == null){
			s.setNamespace(SettingDAO.DEFAULT_NS);
		}
		if(values == null){
			s.setValue("");
		}else if(values.length == 1){
			s.setValue(values[0]);
		}else {
			JSONArray.toJSONString(Arrays.asList(values));
		}
		dao.save(s);
		return s;
	}

	@Override
	public boolean update(Setting setting) {
		dao.update(setting);
		return true;
	}
}
