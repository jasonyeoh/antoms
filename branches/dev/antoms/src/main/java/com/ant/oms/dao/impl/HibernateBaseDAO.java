package com.ant.oms.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
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
		return sf().openSession();
	}
	protected Session cs(){
		return sf().getCurrentSession();
	}
	protected Transaction tx(){
		return s().beginTransaction();
	}
	protected Transaction tx(Session s){
		return s.beginTransaction();
	}
	protected Criteria ec(){
		return createCriteria(getEntityClass());
	}
	protected Query hql(String hql){
		return hql(s(),hql);
	}
	protected Query hql(Session s, String hql){
		return s.createQuery(hql);
	}
	protected SQLQuery sql(String sql){
		return sql(s(),sql);
	}
	protected SQLQuery sql(Session s, String sql){
		return s.createSQLQuery(sql);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(){
		return (List<T>)ht().loadAll(getEntityClass());
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAllById(List<Serializable> ids) {
		return ec().add(Restrictions.in("id", ids)).list();
	}
	@Override
	public Serializable save(T entity){
		return ht().save(entity);
	}
	@Override
	public void update(T entity){
		ht().update(entity);
	}
	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T) ht().get(getEntityClass(), id);
	}
	@Override
	public void delete(T entity) {
		ht().delete(entity);
	}
	@Override
	public void deleteAll(List<T> entities) {
		ht().deleteAll(entities);
	}
	@Override
	public void deleteById(Serializable id){
		delete(get(id));
		
	}
	@Override
	public void deleteAllById(List<Serializable> ids) {
		// TODO Auto-generated method stub
		
	}
	abstract protected Class<T> getEntityClass();
	
}
