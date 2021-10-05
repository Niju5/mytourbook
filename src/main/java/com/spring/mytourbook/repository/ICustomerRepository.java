package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.*;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {

}
