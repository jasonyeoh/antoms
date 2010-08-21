package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable , BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2079069159462468125L;
	private long id;
	private String name;
	private String description;
	private Set<LoginRole> logins;
	@Id
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
	@OneToMany(mappedBy="role")
	public Set<LoginRole> getLogins() {
		return logins;
	}
	public void setLogins(Set<LoginRole> logins) {
		this.logins = logins;
	}
	
	
}
