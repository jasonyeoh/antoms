package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.Catalog;

public interface CatalogDAO extends BaseDAO<Catalog>{
	public Collection<Catalog> getAllActive();
}