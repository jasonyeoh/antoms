package com.ant.oms.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T> {
	public List<T> getAll();
	public T get(Serializable id);
	public Serializable save(T entity);
	public void delete(T entity);
	public void deleteById(Serializable id);
}
