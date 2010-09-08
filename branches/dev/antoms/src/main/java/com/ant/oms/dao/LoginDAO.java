package com.ant.oms.dao;

import com.ant.oms.entity.Login;

public interface LoginDAO extends BaseDAO<Login> {
	public Login getLoginById(String loginId);

}
