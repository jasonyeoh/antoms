package com.ant.oms.dao.impl.hibernate;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ant.oms.dao.BaseDAO;
import com.ant.oms.entity.BaseEntity;

public abstract class BaseDAOImpl<T extends BaseEntity> extends
		HibernateDaoSupport implements BaseDAO<T> {
	@Autowired
	public void sf(SessionFactory f) {
		super.setSessionFactory(f);
	}

	public Criteria createCriteria(Class<?> entityClass) {
		return s().createCriteria(entityClass);
	}

	protected HibernateTemplate ht() {
		return getHibernateTemplate();
	}

	protected SessionFactory sf() {
		return getSessionFactory();
	}

	protected Session s() {
		return sf().getCurrentSession();
	}

	protected Transaction tx() {
		return s().beginTransaction();
	}

	protected Transaction tx(Session s) {
		return s.beginTransaction();
	}

	protected Criteria ec() {
		return createCriteria(getEntityClass());
	}

	protected Query hql(String hql) {
		return hql(s(), hql);
	}

	protected Query hql(Session s, String hql) {
		return s.createQuery(hql);
	}

	protected SQLQuery sql(String sql) {
		return sql(s(), sql);
	}

	protected SQLQuery sql(Session s, String sql) {
		return s.createSQLQuery(sql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getAll() {
		return ht().loadAll(getEntityClass());
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getAll(int offset, int size) {
		Criteria c = ec();
		if (offset > 0) {
			c = c.setFirstResult(offset);
		}
		if (size > 0) {
			c = c.setMaxResults(size);
		}
		return c.list();
	}
	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getAllByIds(Collection<Serializable> ids) {
		return ec().add(Restrictions.in("id", ids)).list();
	}
	

	@Override
	public Serializable saveNew(T entity) {
		return ht().save(entity);
	}

	@Override
	public T update(T entity) {
		ht().update(entity);
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T) ht().get(getEntityClass(), id);
	}

	@Override
	public boolean delete(T entity) {
		ht().delete(entity);
		return true;
	}

	@Override
	public boolean deleteAll(Collection<T> entities) {
		ht().deleteAll(entities);
		return true;
	}

	@Override
	public boolean deleteById(Serializable id) {
		return delete(get(id));

	}

	@Override
	public boolean deleteAllById(Collection<Serializable> ids) {
		return deleteAll(getAllByIds(ids));

	}

	@Override
	public long getCount() {
		Long count = (Long) ec().setProjection(Projections.rowCount())
				.uniqueResult();
		ec().setProjection(null).setResultTransformer(Criteria.ROOT_ENTITY);
		return count;
	}
	abstract protected Class<T> getEntityClass();

}
