package com.ant.oms.dao.impl.hibernate;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.ForumThreadDAO;
import com.ant.oms.entity.ForumPost;
import com.ant.oms.entity.ForumThread;

@Service
public class ForumThreadDAOImpl extends BaseDAOImpl<ForumThread> implements ForumThreadDAO {

	@Override
	protected Class<ForumThread> getEntityClass() {
		return ForumThread.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ForumPost> getThreadsForForum(long id, int offset, int size) {
		return ec().add(Restrictions.eq("parentForum", id )).setMaxResults(size).setFirstResult(offset).list();
	}

}
