package com.ant.oms.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.CatalogDAO;
import com.ant.oms.entity.Catalog;
@Service
public class HibernateCatalogDAO extends HibernateBaseDAO<Catalog> implements CatalogDAO {
	@SuppressWarnings("unchecked")
	@Override
	public List<Catalog> getAllActive() {
		DetachedCriteria dc = DetachedCriteria.forClass(Catalog.class);
		dc.add(Restrictions.eq("active", "true"));
		return ht().findByCriteria(dc);
	}

	@Override
	protected Class<Catalog> getEntityClass() {
		return Catalog.class;
	}
}
