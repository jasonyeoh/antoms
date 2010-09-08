package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.ForumPost;
import com.ant.oms.entity.ForumThread;

public interface ForumThreadDAO extends BaseDAO<ForumThread> {

	Collection<ForumPost> getThreadsForForum(long id, int offset, int size);

}
