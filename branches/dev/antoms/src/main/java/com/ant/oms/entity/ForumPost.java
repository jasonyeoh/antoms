package com.ant.oms.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class ForumPost implements BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5671211855008611984L;
	private long id;
	private String title;
	private String content;
	private Login postedBy;
	private Date postedOn;
	private ForumPost parentPost;
	private Thread parentThread;
	private boolean active;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@OneToOne
	public Login getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(Login postedBy) {
		this.postedBy = postedBy;
	}
	public Date getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}
	@ManyToOne
	public ForumPost getParentPost() {
		return parentPost;
	}
	public void setParentPost(ForumPost parentPost) {
		this.parentPost = parentPost;
	}
	@ManyToOne(optional=false)
	public Thread getParentThread() {
		return parentThread;
	}
	public void setParentThread(Thread parentThread) {
		this.parentThread = parentThread;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
