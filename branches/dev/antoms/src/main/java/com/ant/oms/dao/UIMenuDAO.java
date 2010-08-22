package com.ant.oms.dao;

import java.util.List;

import com.ant.oms.entity.UIMenu;

public interface UIMenuDAO extends BaseDAO<UIMenu>{

	void saveMenu(UIMenu menu, List<UIMenu> entries);

}
