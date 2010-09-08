package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.UIChoice;

public interface UIChoiceDAO extends BaseDAO<UIChoice>{
	public static final String DEFAULT_LOCALE = "en";
	public Collection<UIChoice> getByChoiceId(String id, String locale);
	public boolean deleteChoice(String choiceId, String locale);
	public boolean deleteChoice(String choiceId);
}
