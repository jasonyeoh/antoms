package com.ant.oms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class LoginRole implements Serializable, BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5619720137808075296L;
	private long id;
	private Login login;
	private Role role;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@OneToOne(optional=true)
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@OneToOne(optional=true)
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
