package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.ForumPost;

public interface ForumPostDAO extends BaseDAO<ForumPost> {
	public Collection<ForumPost> getPostsForThread(long id, int offset, int size); 

}
