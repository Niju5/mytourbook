package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.Travels;

public interface ITravelsRepository  extends JpaRepository<Travels,Long> {

}
