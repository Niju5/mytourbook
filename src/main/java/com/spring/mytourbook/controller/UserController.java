package com.spring.mytourbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mytourbook.entities.User;
import com.spring.mytourbook.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	IUserService uservice;
	@PostMapping("/anewuser")
	public User addnewUser(@RequestBody User user) {
		return uservice.addnewUser(user);
	}
	@PostMapping("/signin")
	public User signIn(@RequestBody User user) {
		return uservice.signIn(user);
	}
	@PostMapping("/signout")
	public User signOut(@RequestBody User user) {
		return uservice.signOut(user);
	}

}
