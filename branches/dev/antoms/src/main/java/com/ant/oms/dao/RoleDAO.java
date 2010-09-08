package com.ant.oms.dao;

import java.util.Collection;

import com.ant.oms.entity.Role;

public interface RoleDAO extends BaseDAO<Role> {
	public Collection<Role> getAllRole(Collection<String> roleNames);
	public Role getRole(String roleName);
}
