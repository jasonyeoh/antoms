package com.ant.oms.dao;

import java.util.List;

import com.ant.oms.entity.UIChoice;

public interface UIChoiceDAO extends BaseDAO<UIChoice>{
	public static final String DEFAULT_LOCALE = "en";
	public List<UIChoice> getByChoiceId(String id, String locale);
	public void deleteChoice(String choiceId, String locale);
	public void deleteChoice(String choiceId);
}
