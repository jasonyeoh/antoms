package com.ant.oms.dao.impl.hibernate;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.ForumPostDAO;
import com.ant.oms.entity.ForumPost;
@Service
public class ForumPostDAOImpl extends BaseDAOImpl<ForumPost> implements ForumPostDAO {

	@Override
	protected Class<ForumPost> getEntityClass() {
		return ForumPost.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ForumPost> getPostsForThread(long id, int offset, int size) {
		return ec().add(Restrictions.eq("parentThread", id)).setMaxResults(size).setFirstResult(offset).list();
	}

}
