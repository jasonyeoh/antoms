package com.ant.oms.service.impl;

import java.util.Date;
import java.util.List;

import com.ant.oms.dao.CatalogDAO;
import com.ant.oms.entity.Catalog;
import com.ant.oms.entity.Image;
import com.ant.oms.service.CatalogService;

public class CatalogServiceImpl implements CatalogService{
	CatalogDAO dao;
	ImageServiceImpl is;
	@Override
	public List<Catalog> getAll(){
		return dao.getAll();
	}
	@Override
	public void createNew(String name, String description, String coverImage ){
		Catalog c = new Catalog();
		Image i = is.createFromPath(name+"-coverimage", coverImage);
		c.setActive(true);
		c.setCoverPage(i);
		c.setDescription(description);
		c.setLaunchDate(new Date());
		c.setName(name);
		dao.save(c);
	}
	@Override
	public List<Catalog> getAllActive() {
		return dao.getAllActive();
	}
	@Override
	public Catalog get(long id) {
		return dao.get(id);
	}
	@Override
	public void save(Catalog catalog) {
		is.save(catalog.getCoverPage());
		dao.save(catalog);
	}
}
