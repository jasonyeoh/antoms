package com.ant.oms.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role implements  BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2079069159462468125L;
	private long id;
	private String name;
	private String description;
	private Collection<Login> logins;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(name="role_name", unique=true)
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
	@ManyToMany(
	        targetEntity=Login.class,
	        cascade={CascadeType.PERSIST, CascadeType.MERGE}
	    )
	    @JoinTable(
	        name="t_role_login",
	        joinColumns=@JoinColumn(name="role_id"),
	        inverseJoinColumns=@JoinColumn(name="login_id")
	    )
	public Collection<Login> getLogins() {
		return logins;
	}
	public void setLogins(Collection<Login> logins) {
		this.logins = logins;
	}
	
	
}
