package com.ant.oms.dao.impl.hibernate;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.ant.oms.dao.UIMenuDAO;
import com.ant.oms.entity.UIMenu;
@Service
public class UIMenuDAOImpl extends BaseDAOImpl<UIMenu> implements UIMenuDAO{
	
	@Override
	protected Class<UIMenu> getEntityClass() {
		return UIMenu.class;
	}

	@Override
	public void saveMenu(UIMenu menu, Collection<UIMenu> entries) {
		s().saveOrUpdate(menu);
		for(UIMenu entry:entries){
			s().saveOrUpdate(entry);
		}
	}

}
