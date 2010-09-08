package com.ant.oms.dao.impl.hibernate;

import org.springframework.stereotype.Service;

import com.ant.oms.dao.ForumDAO;
import com.ant.oms.entity.Forum;
@Service
public class ForumDAOImpl extends BaseDAOImpl<Forum> implements ForumDAO{

	@Override
	protected Class<Forum> getEntityClass() {
		return Forum.class;
	}

}
