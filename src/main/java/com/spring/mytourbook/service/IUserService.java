package com.spring.mytourbook.service;

import com.spring.mytourbook.entities.User;

public interface IUserService {
	public User addnewUser(User user);
	public User signIn(User user);
	public User signOut(User user);
	
}
