package com.ant.oms.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Forum implements BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9036544245383949400L;
	private long id;
	private String name;
	private String description;
	private boolean active;
	private boolean locked;
	private Login owner;
	private Collection<ForumThread> threads;
	private Image icon;
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(unique=true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Login getOwner() {
		return owner;
	}
	public void setOwner(Login owner) {
		this.owner = owner;
	}
	@OneToMany()
	public Collection<ForumThread> getForumThreads() {
		return threads;
	}
	public void setForumThreads(Collection<ForumThread> threads) {
		this.threads = threads;
	}
	@OneToOne()
	public Image getIcon() {
		return icon;
	}
	public void setIcon(Image icon) {
		this.icon = icon;
	}
}
