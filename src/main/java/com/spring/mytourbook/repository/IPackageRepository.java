package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.TravelPackage;

public interface IPackageRepository extends JpaRepository<TravelPackage,Long> {

}
