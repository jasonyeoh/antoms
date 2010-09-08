package com.ant.oms.service;

import java.util.Collection;

import com.ant.oms.entity.Catalog;

public interface CatalogService {
	public Collection<Catalog> getAll();
	public void createNew(String name, String description, String coverImage );
	public void save(Catalog catalog);
	public Collection<Catalog> getAllActive();
	public Catalog get(long id);
}
