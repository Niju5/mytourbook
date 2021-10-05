package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.Report;

public interface IReportRepository extends JpaRepository<Report,Long> {

}
