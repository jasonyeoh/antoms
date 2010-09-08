package com.ant.oms.service;

import java.util.Collection;

import com.ant.oms.entity.Login;

public interface UserService {
	public Login getLoginById(String id);
	public Collection<Login> getLoginsForRoles(String role);
}
