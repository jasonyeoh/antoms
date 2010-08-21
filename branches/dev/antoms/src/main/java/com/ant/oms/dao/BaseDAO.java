package com.ant.oms.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
	public Serializable save(T entity);
	public void update(T entity);
	public T get(Serializable id);
	public List<T> getAll();
	public List<T> getAllById(List<Serializable> ids);
	public void delete(T entity);
	public void deleteAll(List<T> entities);
	public void deleteById(Serializable id);
	public void deleteAllById(List<Serializable> ids);
	
}
