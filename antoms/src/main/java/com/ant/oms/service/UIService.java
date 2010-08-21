package com.ant.oms.service;

import java.util.Map;

import com.ant.oms.entity.UIMenu;

public interface UIService { 
	public void addChoice(String id, Map<String, String> values, String locale);
	public Map<String, String> getChoice(String choiceId, String locale);
	public Map<String, String> getChoice(String choiceId);
	public void deleteChoiceLocale(String choiceId, String locale);
	public void deleteChoice(String choiceId);
	public void saveMenu(String id, String name, Map<String, String> items);
	public void deleteMenu(String name);
	public UIMenu getMenu(String id);
}
