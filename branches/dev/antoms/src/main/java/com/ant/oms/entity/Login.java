package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1578195361536921581L;
	private long id;
	private String loginId;
	private String password;
	@ManyToMany
	private Set<Role> roles;
	private boolean active;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	
}
