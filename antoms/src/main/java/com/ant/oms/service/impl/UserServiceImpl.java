package com.ant.oms.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ant.oms.dao.LoginDAO;
import com.ant.oms.dao.RoleDAO;
import com.ant.oms.entity.Login;
import com.ant.oms.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private LoginDAO loginDAO;
	
	@Autowired
	private RoleDAO roleDAO;
	
	
	
	@Override
	public Login getLoginById(String id) {
		return loginDAO.getLoginById(id);
	}

	@Override
	public Collection<Login> getLoginsForRoles(String role) {
		return roleDAO.getRole(role).getLogins(); 
	}
	

}
