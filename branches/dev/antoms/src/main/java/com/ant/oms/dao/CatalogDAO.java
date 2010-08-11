package com.ant.oms.dao;

import java.util.List;

import com.ant.oms.entity.Catalog;

public interface CatalogDAO extends BaseDAO<Catalog>{
	public List<Catalog> getAllActive();
}