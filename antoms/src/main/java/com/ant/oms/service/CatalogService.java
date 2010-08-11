package com.ant.oms.service;

import java.util.List;

import com.ant.oms.entity.Catalog;

public interface CatalogService {
	public List<Catalog> getAll();
	public void createNew(String name, String description, String coverImage );
	public void save(Catalog catalog);
	public List<Catalog> getAllActive();
	public Catalog get(long id);
}
