package com.ant.oms.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ant.oms.dao.UIChoiceDAO;
import com.ant.oms.dao.UIMenuDAO;
import com.ant.oms.entity.UIChoice;
import com.ant.oms.entity.UIMenu;
import com.ant.oms.service.UIService;

public class UIServiceImpl implements UIService {
	@Autowired
	UIChoiceDAO choiceDao;
	@Autowired
	UIMenuDAO menuDao;

	@Override
	public void addChoice(String id, Map<String, String> values, String locale) {
		for(String k : values.keySet()){
			UIChoice c = new UIChoice();
			c.setKey(k);
			c.setLocale(locale);
			c.setValue(values.get(k));
			choiceDao.save(c);
		}
	}

	@Override
	public Map<String, String> getChoice(String choiceId, String locale) {
		List<UIChoice> choices = choiceDao.getByChoiceId(choiceId, (locale == null)?UIChoiceDAO.DEFAULT_LOCALE:locale);
		Map<String, String> cmap = new LinkedHashMap<String, String>();
		for(UIChoice c : choices){
			cmap.put(c.getKey(), c.getValue());
		}
		return cmap;
	}

	@Override
	public void deleteChoiceLocale(String choiceId, String locale) {
		choiceDao.deleteChoice(choiceId, locale);
	}

	@Override
	public void deleteChoice(String choiceId) {
		choiceDao.deleteChoice(choiceId);
	}

	@Override
	public void saveMenu(String id, String name, Map<String, String> items) {
	}

	@Override
	public void deleteMenu(String name) {
	}

	@Override
	public Map<String, String> getChoice(String choiceId) {
		return null;
	}

	@Override
	public UIMenu getMenu(String id) {
		return null;
	}
}
