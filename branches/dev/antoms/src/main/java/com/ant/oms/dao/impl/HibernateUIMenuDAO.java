package com.ant.oms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.UIMenuDAO;
import com.ant.oms.entity.UIMenu;
@Service
public class HibernateUIMenuDAO extends HibernateBaseDAO<UIMenu> implements UIMenuDAO{

	@Override
	protected Class<UIMenu> getEntityClass() {
		return UIMenu.class;
	}

	@Override
	public void saveMenu(UIMenu menu, List<UIMenu> entries) {
		Session s = s();
		Transaction tx = tx(s);
		s.save(menu);
		for(UIMenu m:entries){
			s.save(m);
		}
		tx.commit();
		
	}

}
