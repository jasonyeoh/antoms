package com.ant.oms.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.ForumDAO;
import com.ant.oms.dao.ForumPostDAO;
import com.ant.oms.dao.ForumThreadDAO;
import com.ant.oms.entity.Forum;
import com.ant.oms.entity.ForumPost;
import com.ant.oms.entity.ForumThread;
import com.ant.oms.service.ForumService;
import com.ant.oms.service.UserService;
@Service
public class ForumServiceImpl implements ForumService{
	@Autowired
	private ForumDAO forumDAO;
	@Autowired
	private ForumThreadDAO threadDAO;
	@Autowired
	private ForumPostDAO postDAO;
	@Autowired
	private UserService userService;
	
	@Override
	public ForumPost getPostById(long id) {
		return postDAO.get(id);
	}

	@Override
	public ForumThread getThread(long id) {
		return threadDAO.get(id);
	}

	@Override
	public Collection<ForumPost> getPostsForThread(ForumThread thread, int offset, int size) {
		return postDAO.getAll(offset, size);
	}

	@Override
	public Collection<ForumThread> getThreadsForForum(Forum forum, int offset,
			int size) {
		return threadDAO.getAll(offset, size);
	}

	@Override
	public Collection<Forum> getForums(int offset, int size) {
		return forumDAO.getAll(offset, size);
	}
	@Override
	public Forum createForum(String forumName, String description, String owner){
		Forum f = new Forum();
		f.setActive(true);
		f.setDescription(description);
		f.setName(forumName);
		f.setLocked(false);
		f.setOwner(userService.getLoginById(owner));
		forumDAO.saveNew(f);
		return f;
	}

	@Override
	public Forum getForum(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Forum createThread(int forumId, String threadTitle,
			String description, String owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Forum createPost(int threadId, String postTitle, String text,
			String owner, int parentPost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Forum forum) {
		forumDAO.update(forum);
		return true; 
	}

	@Override
	public boolean update(ForumThread thread) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ForumPost post) {
		// TODO Auto-generated method stub
		return false;
	}

}
