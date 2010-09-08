package com.ant.oms.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"parentForum","title"})})
public class ForumThread implements BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -598290850098631787L;
	private long id;
	private String title;
	private String description;
	private boolean active;
	private boolean locked;
	private Login owner;
	private Collection<ForumPost> posts;
	private Forum parentForum;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	@ManyToOne
	public Login getOwner() {
		return owner;
	}
	public void setOwner(Login owner) {
		this.owner = owner;
	}
	@OneToMany(mappedBy="parentThread")
	public Collection<ForumPost> getPosts() {
		return posts;
	}
	public void setPosts(Collection<ForumPost> posts) {
		this.posts = posts;
	}
	@ManyToOne
	public void setParentForum(Forum parentForum) {
		this.parentForum = parentForum;
	}
	public Forum getParentForum() {
		return parentForum;
	}
	
}
