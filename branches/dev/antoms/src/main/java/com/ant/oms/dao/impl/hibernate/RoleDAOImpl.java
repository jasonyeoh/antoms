package com.ant.oms.dao.impl.hibernate;

import java.util.Collection;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.RoleDAO;
import com.ant.oms.entity.Role;
@Service
public class RoleDAOImpl extends BaseDAOImpl<Role> implements RoleDAO {
	@Override
	protected Class<Role> getEntityClass() {
		return Role.class;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Role> getAllRole(Collection<String> roleNames) {
		return ec().add(Restrictions.in("role_name", roleNames)).list();
	}

	@Override
	public Role getRole(String roleName) {
		return (Role) ec().add(Restrictions.eq("role_name", roleName)).uniqueResult();
	}

}
