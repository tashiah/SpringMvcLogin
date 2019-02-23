package com.program.demo.service.impl;

import java.sql.SQLException;

import com.program.demo.dao.UserDAO;
import com.program.demo.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public UserDAO getUserDao()
	{
			return this.userDAO;
	}

	public void setUserDAO(UserDAO userDAO)
	{
			this.userDAO = userDAO;
	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException
	{
			return userDAO.isValidUser(username, password);
	}
}
