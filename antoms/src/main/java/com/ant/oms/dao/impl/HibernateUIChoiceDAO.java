package com.ant.oms.dao.impl;

import com.ant.oms.dao.UIChoiceDAO;
import com.ant.oms.entity.UIChoice;

public class HibernateUIChoiceDAO extends HibernateBaseDAO<UIChoice> implements UIChoiceDAO {

	@Override
	protected Class<UIChoice> getEntityClass() {
		return UIChoice.class;
	}


}
