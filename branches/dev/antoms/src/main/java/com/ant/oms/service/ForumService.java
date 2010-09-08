package com.ant.oms.service;

import java.util.Collection;

import com.ant.oms.entity.Forum;
import com.ant.oms.entity.ForumPost;
import com.ant.oms.entity.ForumThread;

public interface ForumService {

	public ForumPost getPostById(long id);

	public ForumThread getThread(long id);
	
	public Forum getForum(long id);

	public Collection<ForumPost> getPostsForThread(ForumThread thread, int offset, int size);
	
	public Collection<ForumThread> getThreadsForForum(Forum forum, int offset, int size);
	
	public Collection<Forum> getForums(int offset, int size);

	public Forum createForum(String forumName, String description, String owner);
	
	public Forum createThread(int forumId, String threadTitle, String description, String owner);
	
	public Forum createPost(int threadId, String postTitle, String text, String owner, int parentPost);
	
	public boolean  update(Forum forum);
	
	public boolean update(ForumThread thread);
	
	public boolean update(ForumPost post);
	

}
