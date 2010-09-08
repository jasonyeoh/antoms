package com.ant.oms.dao.impl.hibernate;

import org.hibernate.criterion.Restrictions;

import com.ant.oms.dao.LoginDAO;
import com.ant.oms.entity.Login;

public class LoginDAOImpl extends BaseDAOImpl<Login> implements LoginDAO {
	@Override
	protected Class<Login> getEntityClass() {
		return Login.class;
	}

	@Override
	public Login getLoginById(String loginId) {
		return (Login) ec().add(Restrictions.eq("loginid", loginId)).uniqueResult();
	}

}
