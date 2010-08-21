package com.ant.oms.dao.impl;

import com.ant.oms.dao.UIMenuDAO;
import com.ant.oms.entity.UIMenu;

public class HibernateUIMenuDAO extends HibernateBaseDAO<UIMenu> implements UIMenuDAO{

	@Override
	protected Class<UIMenu> getEntityClass() {
		return UIMenu.class;
	}

}
