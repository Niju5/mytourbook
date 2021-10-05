package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.Route;

public interface IRouteRepository extends JpaRepository<Route,Long>{

}
