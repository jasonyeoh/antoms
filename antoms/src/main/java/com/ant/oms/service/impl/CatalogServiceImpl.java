package com.ant.oms.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.CatalogDAO;
import com.ant.oms.entity.Catalog;
import com.ant.oms.entity.Image;
import com.ant.oms.service.CatalogService;
@Service
public class CatalogServiceImpl implements CatalogService{
	@Autowired
	CatalogDAO dao;
	
	@Autowired
	ImageServiceImpl is;
	@Override
	public List<Catalog> getAll(){
		return new ArrayList<Catalog>(dao.getAll());
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
		dao.saveNew(c);
	}
	@Override
	public List<Catalog> getAllActive() {
		return new ArrayList<Catalog>(dao.getAllActive());
	}
	@Override
	public Catalog get(long id) {
		return dao.get(id);
	}
	@Override
	public void save(Catalog catalog) {
		is.save(catalog.getCoverPage());
		dao.saveNew(catalog);
	}
}
