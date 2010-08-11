package com.ant.oms.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ant.oms.dao.BaseDAO;

public abstract class HibernateBaseDAO<T> extends HibernateDaoSupport implements BaseDAO<T>{
	public Criteria createCriteria(Class<?> entityClass){
		return s().createCriteria(entityClass);
	}
	protected HibernateTemplate ht(){
		return getHibernateTemplate();
	}
	protected SessionFactory sf(){
		return getSessionFactory();
	}
	protected Session s(){
		return sf().getCurrentSession();
	}
	@SuppressWarnings("unchecked")
	public List<T> getAll(){
		return (List<T>)ht().loadAll(getEntityClass());
	}
	
	public Serializable save(T entity){
		return ht().save(entity);
	}
	@SuppressWarnings("unchecked")
	public T get(Serializable id) {
		return (T) ht().get(getEntityClass(), id);
	}
	public void delete(T entity) {
		ht().delete(entity);
	}
	public void deleteById(Serializable id){
		delete(get(id));
		
	}
	abstract protected Class<T> getEntityClass();
	
}
