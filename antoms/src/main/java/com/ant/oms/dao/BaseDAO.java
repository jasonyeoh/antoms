package com.ant.oms.dao;

import java.io.Serializable;
import java.util.Collection;

import com.ant.oms.entity.BaseEntity;

public interface BaseDAO<T extends BaseEntity> {
	public Serializable saveNew(T entity);
	public T update(T entity);
	public T get(Serializable id);
	public Collection<T> getAll();
	public Collection<T> getAllByIds(Collection<Serializable> ids);
	public Collection<T> getAll(int offset, int size);
	public boolean delete(T entity);
	public boolean deleteAll(Collection<T> entities);
	public boolean deleteById(Serializable id);
	public boolean deleteAllById(Collection<Serializable> ids);
	public long getCount();
	
}
