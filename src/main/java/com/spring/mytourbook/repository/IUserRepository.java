package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.User;

public interface IUserRepository extends JpaRepository<User,Long> {

	User findByUserName(String userName);

}
