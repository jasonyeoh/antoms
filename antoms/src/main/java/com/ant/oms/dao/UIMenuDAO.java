package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.UIMenu;

public interface UIMenuDAO extends BaseDAO<UIMenu>{

	void saveMenu(UIMenu menu, Collection<UIMenu> entries);

}
