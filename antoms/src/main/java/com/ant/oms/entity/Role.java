package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2079069159462468125L;
	private long id;
	private String name;
	private String description;
	@ManyToMany
	private Set<Login> logins;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Set<Login> getLogins() {
		return logins;
	}
	public void setLogins(Set<Login> logins) {
		this.logins = logins;
	}
	
	
}
