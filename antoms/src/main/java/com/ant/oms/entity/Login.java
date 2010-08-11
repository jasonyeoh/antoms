package com.ant.oms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Login implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1578195361536921581L;
	private long id;
	private String loginId;
	private String password;
	private Set<LoginRole> roles;
	private boolean active;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(unique=true, length=32)
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
	@OneToMany(mappedBy="login")
	public Set<LoginRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<LoginRole> roles) {
		this.roles = roles;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}	
}
