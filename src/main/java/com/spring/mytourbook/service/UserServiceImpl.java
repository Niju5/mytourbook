package com.spring.mytourbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.User;
import com.spring.mytourbook.repository.ITravelsRepository;
import com.spring.mytourbook.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	IUserRepository repo;
	@Override
	public User addnewUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public User signIn(User user) {
		User userNow = repo.findByUserName(user.getUserName());

		if (user.getPassword().equals(userNow.getPassword())) {
		return userNow;
		}
		//if(userNow==null) {System.out.println("Invalid user");}
		return null;
		
	}

	@Override
	public User signOut(User user) {
		User userNow = repo.findByUserName(user.getUserName());

		if (user.getPassword().equals(userNow.getPassword())) {
		return userNow;
		}
		//if(userNow==null) {System.out.println("Invalid pws");}
		return null;
		
	}

}
