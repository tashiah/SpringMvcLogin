package com.program.demo.delegate;

import java.sql.SQLException;

import com.program.demo.service.UserService;

public class LoginDelegate {
	
	private UserService userService;

	public UserService getUserService()
	{
			return this.userService;
	}

	public void setUserService(UserService userService)
	{
			this.userService = userService;
	}

	public boolean isValidUser(String username, String password) throws SQLException
	{
		    return userService.isValidUser(username, password);
	}
}
